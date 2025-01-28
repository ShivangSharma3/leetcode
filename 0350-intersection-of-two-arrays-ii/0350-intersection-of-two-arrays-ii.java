class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> set=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums1){
            set.put(num,set.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(set.containsKey(num) && set.get(num)>0){
                list.add(num);
                set.put(num,set.get(num)-1);
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}