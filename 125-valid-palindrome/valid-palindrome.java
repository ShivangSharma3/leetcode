class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       StringBuilder a=new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i)))
            a.append(s.charAt(i));
       }
       String old=a.toString();
       String rev=a.reverse().toString();
       if(old.equals(rev)){
        return true;
       }
       else{
        return false;
       }
    }
}