class Solution {
    static final int MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;  // number of even positions
        long oddCount = n / 2;         // number of odd positions

        long val = (Good(5, evenCount) * Good(4, oddCount)) % MOD;
        return (int) val;
    }

    // Recursive fast power with modulo
    public static long Good(long base, long exp) {
        if (exp == 0) return 1;
        long half = Good(base, exp / 2);
        long result = (half * half) % MOD;
        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }
        return result;
    }
}
