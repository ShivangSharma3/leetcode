class Solution {
    public int jump(int[] nums) {
        int coverage=0;
        int lastJumpIdx=0;
        int n=nums.length;
        int jump=0;
        if(n==1){
            return 0;
        }
        for(int i=0;i<n;i++){

            coverage=Math.max(coverage,i+nums[i]);

           if(i==lastJumpIdx){
            lastJumpIdx=coverage;
            jump++;

            if(coverage>=n-1){
                return jump;
            }
           }
        }
        return jump;
    }
}