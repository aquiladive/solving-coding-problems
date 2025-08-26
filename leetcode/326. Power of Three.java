//326. Power of Three
//Runtime beats 81.87%, memory only beats 18.76%.
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0)
            return false;
        while(n % 3 == 0) {
            n = n/3;
        }
        if(n == 1)
            return true;
        else
            return false;
    }
}
