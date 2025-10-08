class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
       int n=spells.length;
       int m=potions.length;
       int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int left=0;
            int right=m-1;
            int count=m;
            while(left<=right){
                int mid=left+(right-left)/2;
                long res=(long)spells[i]*potions[mid];
                if(res>=success){
                    count=mid;
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
                
            }
            arr[i]=m-count;
        }
        return arr;
    }
}