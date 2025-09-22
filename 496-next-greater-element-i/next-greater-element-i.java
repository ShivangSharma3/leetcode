class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[n];
        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++){
            int k=-1;
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                     k=nums2[j];
                    // for(int k=j+1;k<m;k++){
                    //     if(nums2[k]>nums2[j]){
                    //         arr[i]=nums2[k];
                    //         break;
                    //     }
                    // }
                }
                
                    if(k!=-1 && nums2[j]>k){
                        arr[i]=nums2[j];
                        break;
                    }
            }
        }
        return arr;
    }
}