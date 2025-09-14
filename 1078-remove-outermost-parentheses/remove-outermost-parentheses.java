class Solution {
    public String removeOuterParentheses(String s) {
      int n=s.length();
      int count1=1;
      StringBuilder str=new StringBuilder();
      for(int i=1;i<n;i++){
        if(s.charAt(i)==')'){
            count1--;
          if(count1>0){
            str.append(s.charAt(i));
            }
          }else if(s.charAt(i)=='('){
            if(count1>0){
            str.append(s.charAt(i));
          }
          count1++;
        }
      }
      return str.toString();
    }
}