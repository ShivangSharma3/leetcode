class Solution {
    public boolean detectCapitalUse(String word) {
        char[] arr=word.toCharArray();
        int capitalLen=0;
        for(char c:arr){
            if(c>='A' && c<='Z'){
                capitalLen++;
            }
        }
        if(capitalLen==arr.length){
                return true;
            }
        else if(capitalLen==0){
                return true;
            }
        else if((capitalLen==1) && (arr[0]>='A' && arr[0]<='Z')){
                return true;
            }
        return false;
    }
}