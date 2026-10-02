class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list= new ArrayList<>();
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        if(nums.length>max){
            max=nums.length;
        }

        int arr[]=new int [max+1];
        for(int i=0;i<=max;i++){
            arr[i]= -1;
        }
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=nums[i];
        }
        for(int i=1;i<=max;i++){
            if(arr[i]==-1){
                list.add(i);
            }
        }
        return list;
    }
}