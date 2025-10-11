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

//second solution, using the hints
//runtime beats 100%, memory beats 17.72%

class Solution {
    public int removeElement(int[] nums, int val) {
        int dupCount = 0, i = 0, j = nums.length-1;
        if(j == 0) {
            if(nums[0] == val)
                dupCount++;
        }
        while(i <= j && i < nums.length && j > 0) {
            while(nums[j] == val && j > 0) {
                nums[j] = 0;
                j--;
                dupCount++;
            }
            if(j < 0)
                break;
            if(nums[i] == val) {
                nums[i] = nums[j];
                j--;
                dupCount++;
            }
            i++;
        }
        return nums.length - dupCount;
    }
}
