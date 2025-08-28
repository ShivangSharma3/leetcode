class Solution {
    public double myPow(double x, int n) {
    if(n<0){
        x=1/x;
        return pow(x,-(long)n);
    }
    return pow(x,n);
    }
    public static double pow(double x,long n){
        if(n==0){
            return 1.0;
        }
        if(n%2==0){
            return pow(x*x,n/2);
        }else{
            return x*pow(x*x,(n-1)/2);
        }
    }
}