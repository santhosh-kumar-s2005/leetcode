class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int m=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                m=Math.max(m,j-i);
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return m;
    }
}