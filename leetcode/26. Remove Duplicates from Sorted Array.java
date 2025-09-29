//26. Remove Duplicates from Sorted Array
//runtime is 1ms, beats 58.64% of solutions; memory beats 80.73%

class Solution {
    public int removeDuplicates(int[] nums) {
        int[] copyArray = new int[nums.length];
        copyArray[0] = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == copyArray[count-1])
                nums[i] = -1;
            else {
                copyArray[count] = nums[i];
                count++;
            }
        }
        for(int i = 1; i < count; i++)
            nums[i] = copyArray[i];
        return count;
    }
}
