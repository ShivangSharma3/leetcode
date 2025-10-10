class Solution {
    public int maximumEnergy(int[] energy, int k) {
       int l=energy.length;
       int arr[]=new int[l];
       int res=Integer.MIN_VALUE;
       for(int i=l-1;i>=0;i--){
        arr[i]=energy[i]+(i+k<l?arr[i+k]:0);
        res=Math.max(res,arr[i]);
       } 
       return res;
    }
}