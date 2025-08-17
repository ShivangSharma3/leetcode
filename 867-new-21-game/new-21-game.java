class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k - 1 + maxPts) return 1.0;

        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double W = 1.0;      // sliding window sum of dp[i-1]..dp[i-maxPts], only for i-1 < k
        double ans = 0.0;

        for (int i = 1; i <= n; i++) {
            dp[i] = W / maxPts;

            // Only states < k keep contributing to future draws.
            if (i < k) {
                W += dp[i];
            } else {
                // i >= k: game stops here, so this probability goes into the final answer
                ans += dp[i];
            }

            // Slide window left edge if it was within the contributing range (< k)
            int j = i - maxPts;
            if (j >= 0 && j < k) {
                W -= dp[j];
            }
        }
        return ans;
    }
}
