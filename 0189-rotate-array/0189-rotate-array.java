class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        // Reverse whole array
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

        // Reverse first k elements
        i = 0;
        j = k - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

        // Reverse remaining elements
        i = k;
        j = n - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}