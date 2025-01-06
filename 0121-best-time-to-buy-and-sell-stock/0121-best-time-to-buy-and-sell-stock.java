class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int greatest=0;
        int min=Integer.MAX_VALUE;
        int n=prices.length;
        if(n==1){
            return 0;
        }
        for(int i=0;i<n;i++){
           if(min>prices[i]){
            min=prices[i];
           }
           profit=prices[i]-min;

           if(greatest<profit){
            greatest=profit;
           }
        }
        return greatest;
    }
}