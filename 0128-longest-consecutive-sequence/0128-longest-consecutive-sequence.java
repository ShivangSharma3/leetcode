class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longestSeq=1;
        int currentSeq=1;
        if(nums.length==0){
            return 0;
        }

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                currentSeq++;
            }
            else{
                currentSeq=1;
            }
            if(currentSeq>longestSeq){
                longestSeq=currentSeq;
            }
        }
        return longestSeq;
    }
}