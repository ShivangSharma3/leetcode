class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long mod = 1000000007L;
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        // Monotonic increasing stack for left
        Stack<int[]> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            while (!st.isEmpty() && st.peek()[0] > arr[i]) {
                cnt += st.pop()[1];
            }
            left[i] = cnt;
            st.push(new int[]{arr[i], cnt});
        }
        
        st.clear();
        
        // Monotonic increasing stack for right
        for (int i = n - 1; i >= 0; i--) {
            int cnt = 1;
            while (!st.isEmpty() && st.peek()[0] >= arr[i]) {
                cnt += st.pop()[1];
            }
            right[i] = cnt;
            st.push(new int[]{arr[i], cnt});
        }
        
        long res = 0;
        for (int i = 0; i < n; i++) {
            res = (res + (long)arr[i] * left[i] * right[i]) % mod;
        }
        
        return (int)res;
    }
}
