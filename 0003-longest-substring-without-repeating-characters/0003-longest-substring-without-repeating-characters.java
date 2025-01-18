class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ans=new HashSet<>();
        int j=0;
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            while(ans.contains(s.charAt(i))){
                ans.remove(s.charAt(j));
                j++;
            }
            ans.add(s.charAt(i));
            maxLen=Math.max(maxLen,i-j+1);
        }
        return maxLen;
    }
}