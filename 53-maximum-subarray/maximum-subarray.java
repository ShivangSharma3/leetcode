class Solution {
    public int maxSubArray(int[] nums) {
        int maxx=Integer.MIN_VALUE;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(sum<0){
                sum=0;
            }
            sum+=nums[i];
            
            maxx=Math.max(maxx,sum);
        }
        return maxx;
    }
}