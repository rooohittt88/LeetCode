class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        int small=0;
        // int n = Math.min(n1,n2);
        while (i < n1 && j < n2) {
            small = nums1[i];
            if (small < nums2[j]) {
                i++;
            } else if (small == nums2[j])
                return small;
            else {
                j++;
            }
        }
        return -1;
    }
}