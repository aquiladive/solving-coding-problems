//27. Remove Element
//runtime beats 100%, memory beats 84.79%

class Solution {
    public int removeElement(int[] nums, int val) {
        int[] numsCopy = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                numsCopy[count] = nums[i];
                count++;
            }
        }
        for(int j = 0; j < count; j++) {
            nums[j] = numsCopy[j];
        }
        return count;
    }
}
