class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=-1;
            int start=0;
            while(nums2[start]!=nums1[i]){
                start++;
            }
            for(int j=start;j<nums2.length;j++){
                if(nums1[i]<nums2[j]){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}