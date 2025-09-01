class Solution {
    public int maxSubArray(int[] nums) {
        int maxx=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            sum=sum+nums[i];
            maxx=Math.max(sum,maxx);
        }
        return maxx;
    }
}