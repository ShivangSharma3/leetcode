class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m!=n){
            return false;
        }
        int arr1[]=new int[256];
        int arr2[]=new int[256];
        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(arr1[c1]==0 && arr2[c2]==0){
                arr1[c1]=c2;
                arr2[c2]=c1;
            }else if(arr1[c1]!=c2 || arr2[c2]!=c1){
                return false;
            }
        }
        return true;
    }    
}