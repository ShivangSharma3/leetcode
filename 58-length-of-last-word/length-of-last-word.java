class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.trim().split(" ");
        int n=arr.length;
        String len=arr[n-1];
        int res=len.length();
        return res;
    }
}