class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int rightmost=-1;
        for(int i=n-1;i>=0;i--){
            int current=arr[i];
            arr[i]=rightmost;
            rightmost=Math.max(rightmost,current);
        }
        return arr;
    }
}