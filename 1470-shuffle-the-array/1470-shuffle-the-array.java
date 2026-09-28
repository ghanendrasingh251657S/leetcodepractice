class Solution {
    public int[] shuffle(int[] nums, int n) {

        int arr[] = new int[nums.length];

        
        for (int i = 1; i < nums.length; i = i + 2, n++) {
            arr[i] = nums[n];
        }

       
        int a = 0;

        for (int j = 0; j < nums.length; j = j + 2, a++) {
            arr[j] = nums[a];
        }

        return arr;
    }
}