//283. Move Zeroes
//runtime beats 80.10%, memory beats only 8.15%

class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        for(int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

//another way
//runtime beats 80.10%, memory beats only 6.95%

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while(j < nums.length) {
            if(nums[j] != 0) {
                nums[i++] = nums[j++];
            }
            else
                j++;
        }
        while(i < nums.length)
            nums[i++] = 0;
    }
}
