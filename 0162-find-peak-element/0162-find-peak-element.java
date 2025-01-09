class Solution {
    public int findPeakElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int peak=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                peak=i;
            }
        }
        return peak;
    }
}