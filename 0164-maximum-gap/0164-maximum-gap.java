class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int diff=0;
        int max=0;
        if(n<2){
            return 0;
        }
        for(int i=1;i<n;i++){
            diff=nums[i]-nums[i-1];
            if(diff>max){
                max=diff;
            }
        }
        return max;
    }
}