class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=sumOfSq(n);
        }
        return n==1;
        }
        public static int sumOfSq(int n){
        int sum=0;
        while(n>0){
        int rem=n%10;
        sum=sum+rem*rem;
        n=n/10;
        }
        return sum;
    }
}