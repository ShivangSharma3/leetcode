class Solution {
    public void reverseString(char[] s) {
        char[] result=new char[s.length];
        int k=0;
        for(int i=s.length-1;i>=0;i--){
            result[k]=s[i];
            k++;
        }
        for(int i=0;i<s.length;i++){
            s[i]=result[i];
        }
    }
}