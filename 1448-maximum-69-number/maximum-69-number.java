class Solution {
    public int maximum69Number (int num) {
        int digit=0;
        while(num>0){
            int rem=num%10;
            digit=digit*10+rem;
            num=num/10;
        }
        int res=0;
        boolean change=false;
        while(digit>0){
            int rem=digit%10;
            if(rem==6 && change==false){
                rem=9;
                change=true;
            }
            res=res*10+rem;
            digit/=10;
        }
        return res;
    }
}