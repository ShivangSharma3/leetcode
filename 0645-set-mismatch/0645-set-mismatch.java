class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        for(int num:nums){
            if(map.containsKey(num)){
                arr[0]=num;
            }
            else{
                map.put(num,1);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}