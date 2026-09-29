class Solution {
    public int heightChecker(int[] heights) {
        int arr[]=new int[heights.length];
        int[] copy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(copy[i]!=heights[i])
            {
                count++;
            }
        }
        return count;
    }
}