class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxx=0;
        for(int i=0;i<n;i++){
            if(i>maxx){
                return false;
            }
            maxx=Math.max(maxx,i+nums[i]);
            
        }
        return true;
    }
}