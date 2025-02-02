class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int product1=nums[n]*nums[n-1]*nums[n-2];
        int product2=nums[0]*nums[1]*nums[n];
        return Math.max(product1,product2);
    }
}