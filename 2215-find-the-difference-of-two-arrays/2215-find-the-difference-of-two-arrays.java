class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int count=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    count++;
                }
            }
            if(count==0){
                list1.add(nums1[i]);
            }
        }
           for(int i=0;i<nums2.length;i++){
            int count=0;
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    count++;
                }
            }
            if(count==0){
                list2.add(nums2[i]);
            }
        }
        HashSet<Integer> has1=new HashSet<>(list1);
        HashSet<Integer> has2=new HashSet<>(list2);
        List<Integer> a=new ArrayList<>(has1);
        List<Integer> b=new ArrayList<>(has2);
        List<List<Integer>> lit=new ArrayList();
        lit.add(a);
        lit.add(b);
        
        return lit;
    }
}