import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < nums.length; ) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i += 2; // Skip the pair
            } else {
                list1.add(nums[i]);
                i++;
            }
        }

        // Convert ArrayList<Integer> to int[]
        int[] result = new int[list1.size()];
        for (int j = 0; j < list1.size(); j++) {
            result[j] = list1.get(j);
        }

        return result;
    }
}
