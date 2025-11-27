class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return String.join(" ",arr);
    }
}