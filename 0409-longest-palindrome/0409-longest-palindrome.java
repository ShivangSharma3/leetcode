class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int length=0;
        int odd=0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()%2==0){
                length+=e.getValue();
            }
            else{
                 length+=e.getValue()-1;
                 odd++;
            }
        }
        if(odd>0){
            length+=1;
        }
        return length;
    }
}