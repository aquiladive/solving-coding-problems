//88. Merge Sorted Array
//runtime beats 100%, memory beats 62.70%

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)
            return;
        if(m == 0) {
            for(int k = 0; k < n; k++)
                nums1[k] = nums2[k];
            return;
        }
        int numsCombined[] = new int[(m+n)];
        int count = 0, i = 0, j = 0;
        while(count < (m+n)) {
            if(i == m) {
                numsCombined[count] = nums2[j];
                j++;
            }
            else if(j == n) {
                numsCombined[count] = nums1[i];
                i++;
            }
            else if(nums1[i] > nums2[j]) {
                numsCombined[count] = nums2[j];
                j++;
            }
            else if(nums1[i] < nums2[j]) {
                numsCombined[count] = nums1[i];
                i++;
            }
            else {
                numsCombined[count] = nums1[i];
                i++;
                count++;
                numsCombined[count] = nums2[j];
                j++;
            }
            count++;
        }
        for(int k = 0; k < (m+n); k++) {
            nums1[k] = numsCombined[k];
        }
    }
}
