class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        int n=prices.length;

        if(n==0){
            return 0;
        }

        for(int i=1;i<n;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            else{
                profit+=prices[i]-min;
                min=prices[i];
            }
        }
        return profit;
    }
}