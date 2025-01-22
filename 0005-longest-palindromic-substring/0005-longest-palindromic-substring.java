class Solution {
    public String longestPalindrome(String s) {
       char[] arr=s.toCharArray();
       String longest="";
       for(int i=0;i<arr.length;i++){
        String oddPalindrome=palindrome(arr,i,i);
        String evenPalindrome=palindrome(arr,i,i+1);
        if(oddPalindrome.length()>longest.length()){
            longest=oddPalindrome;
        }
        if(evenPalindrome.length()>longest.length()){
            longest=evenPalindrome;
        }
       } 
       return longest;
    }
    public static String palindrome(char arr[],int start,int end){
        while(start>=0 && end<arr.length && arr[start]==arr[end]){
            start--;
            end++;
        }
        return new String(arr,start+1,end-start-1);
    }
}