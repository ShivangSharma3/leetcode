class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> s1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s1.add(nums[i]);
            s1.add(reverse(nums[i]));
        }
        return s1.size();
    }
    public static int reverse(int n){
        int num=0;
        while(n>0){
            int rem=n%10;
            num=num*10+rem;
            n/=10;
        }
        return num;
    }
}