class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int j:nums2){
            if(set1.contains(j)){
            set2.add(j);}
        }
        int[] arr=new int[set2.size()];
        int k=0;
        for(int num:set2){
            arr[k++]=num;
        }
        return arr;
    }
}