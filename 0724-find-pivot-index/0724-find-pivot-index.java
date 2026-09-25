class Solution {
    public int pivotIndex(int[] nums) {
        // int leftsum=0;
        // int rightsum=0;
        // int i=0;
        // int j=nums.length-1;
        // while(i<j){
        //     leftsum=leftsum+nums[i];
        //      i++;
        //     if(rightsum==leftsum){
        //         return i;
        //     }
        //      j++;
        //     rightsum=leftsum+nums[j];
           
           
        // }
        // return -1;

        int total=0;
        int lefts=0;
        int rights=0;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
           
        }
        rights=total;
        for(int i=0;i<nums.length;i++){
            rights-=nums[i];
            if(lefts==rights){
                return i;
            }
            lefts=lefts+nums[i];
             total=total-lefts;
        
        }
        return -1;

    }
}