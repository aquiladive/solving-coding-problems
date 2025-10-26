//66. Plus One
//runtime beats 100%, memory beats 70.75%

class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1] += 1;
        for(int i = digits.length-1; i > 0; i--) {
            if(digits[i] > 9) {
                digits[i] = 0;
                digits[i-1] += 1;
            }
            else
                break;
        }
        if(digits[0] > 9) {
            int[] plusOne = new int[digits.length+1];
            plusOne[0] = 1;
            plusOne[1] = 0;
            for(int i = 1; i < digits.length; i++)
                plusOne[i+1] = digits[i];
            return plusOne;
        }
        else
            return digits;
    }
}
