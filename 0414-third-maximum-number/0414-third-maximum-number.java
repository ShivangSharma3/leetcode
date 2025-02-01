class Solution {
    public int thirdMax(int[] nums) {
        long fmax = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == fmax || num == smax || num == tmax) {
                continue;
            }
            if (num > fmax) {
                tmax = smax;  
                smax = fmax;  
                fmax = num;   
            } else if (num > smax) {
                tmax = smax;  
                smax = num;  
            } else if (num > tmax) {
                tmax = num;  
            }
        }
        return tmax ==Long.MIN_VALUE? (int)fmax : (int)tmax;
    }
}
