class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        Arrays.sort(nums);
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>n/2){
                max=nums[i];
                break;
            }
        }
        return max;
    }
}