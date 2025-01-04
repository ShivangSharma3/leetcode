class Solution {
    public int reverse(int x) {
        long temp=0;
        while(x!=0){
            int rem=x%10;
            temp=temp*10+rem;
            x=x/10;
        if(temp>Integer.MAX_VALUE || temp<Integer.MIN_VALUE){
            return 0;
        }
        }
        return (int)temp;
    }
}