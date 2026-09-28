class Solution {
    public int[] shuffle(int[] nums, int n) {
        // i create arry as same size
        int arr[] = new int[nums.length];

          int a = 0;
          int j=0;
        //arr[1]=num[3] i increase by 2 , n is incresing by 1 
        // fetch n lenearly and add in arr
        for (int i = 1; i < nums.length; i = i + 2,j=j+2,a++,n++) {
            arr[i] = nums[n];
            arr[j]=nums[a];
        }

       
      

       

        return arr;
    }
}