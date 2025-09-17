class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=sentence.length();
        for(int i=0;i<n;i++){
            map.put(sentence.charAt(i),map.getOrDefault(sentence.charAt(i),0)+1);
        }
        for(char i='a';i<='z';i++){
            if(!map.containsKey(i)){
                return false;
            }
        }
        return true;
    }
}