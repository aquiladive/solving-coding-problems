//69. Sqrt(x)
//incomplete, naive solution

class Solution {
    public int mySqrt(int x) {
        long multiplied = 0;
        for(int i = x/2; i > 0; i--) {
            multiplied = (long)i*i;
            if(multiplied <= x)
                return i;
        }
        return x;
    }
}
