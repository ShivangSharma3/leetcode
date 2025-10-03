class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        double maxDiagonal = 0;

        for (int[] dim : dimensions) {
            int w = dim[0];
            int h = dim[1];
            
            double diag = Math.sqrt(w * w + h * h);
            int area = w * h;

            if (diag > maxDiagonal) {
                maxDiagonal = diag;
                maxArea = area;
            }

            else if (diag == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
