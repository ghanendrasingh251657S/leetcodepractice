class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);
        int res = 0;
        int j = 1;
        for (int i = 0; i < nums.length-1; i++,j++) {

            if (nums[i] == nums[j]) {
                res = nums[i];
            }

            

        }
        return res;
    }
}