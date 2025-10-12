//29. Divide Integers
//runtime only beats 4.07%, memory beats 77.45%

class Solution {
    public int divide(int dividend, int divisor) {
        int quotient = 0, extra = 0;
        boolean multiplyFactor = false;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor <0)) multiplyFactor = true;

        if(divisor == 1)
            return dividend;
        if(divisor == -1) {
            try {
                return Math.multiplyExact(dividend, -1);
            }
            catch(ArithmeticException e) {
                return Integer.MAX_VALUE;
            }
        }
        if(divisor == Integer.MIN_VALUE) {
            if(divisor == dividend) return 1;
            else return 0;
        }
        try {
            if(dividend < 0) dividend = Math.multiplyExact(dividend, -1);
        }
        catch(ArithmeticException e) {
            dividend = Integer.MAX_VALUE;
            extra = 1;
        }
        if(divisor < 0) divisor *= -1;

        while(dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        dividend += extra;
        if(extra == 1 && dividend >= divisor)
            quotient++;

        if(multiplyFactor)
            quotient *= -1;

        return quotient;
    }
}
