class Solution {
    public int subarraySum(int[] nums, int k) {

        // HashMap:
        // key   = prefix sum
        // value = how many times this prefix sum appeared
        HashMap<Integer, Integer> map = new HashMap<>();

        // Important:
        // prefix sum = 0 appears one time before we start
        map.put(0, 1);

        int sum = 0;    // current prefix sum
        int count = 0;  // answer

        for (int i = 0; i < nums.length; i++) {

            // Add current number to prefix sum
            sum = sum + nums[i];

            // We need an old prefix sum:
            // sum - oldSum = k
            //
            // Therefore:
            // oldSum = sum - k
            int needed = sum - k;

            // Check if that prefix sum already exists
            if (map.containsKey(needed)) {

                // If it exists, add its frequency
                count = count + map.get(needed);
            }

            // Store current prefix sum
            // If it already exists, increase its count
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}