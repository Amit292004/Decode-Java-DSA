import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int i = 0, j = 1;

        while (j < n) {
            if (nums[i] == nums[j]) {
                return true;
            }
            i++;
            j++;
        }

        return false;
    }
}
