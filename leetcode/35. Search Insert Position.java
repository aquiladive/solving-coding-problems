//35. Search Insert Position
//in process of solving, not solved

class Solution {
    public int searchInsert(int[] nums, int target) {
        int midpoint = nums.length/2;
        int count = 0;
        while(true) {
            if(nums[midpoint]>target) {
                midpoint = midpoint/2;
                count++;
            }
            else if(nums[midpoint]<target) {
                midpoint = (midpoint+nums.length)/2;
                count++;
            }
            else if(nums[midpoint]==target) {
                return midpoint;
            }
            if(count > Math.log(nums.length))
                break;
        }
        if(nums[midpoint]>target)
            return midpoint;
        else if(nums[midpoint]<target)
            return midpoint+1;
        else
            return midpoint;
    }
}
