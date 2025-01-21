class Solution {
    public String toLowerCase(String s) {
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=65 && arr[i]<=90){
                arr[i]=(char)(arr[i]+32);
            }
        }
        s=String.valueOf(arr);
        return s;
    }
}