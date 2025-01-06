class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        if(nums.length<=2){
            return nums[0];
        }
        while (true) {
            if(nums[i]==nums[i+1] && nums[i]==nums[i+2]){
                i=i+3;
            }
            else{
                return nums[i];
            }
            if(i+1>nums.length-1 || i+2>nums.length-1){
                return nums[i];
            }
        }
    }
}