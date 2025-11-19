//69. Sqrt(x)
//runtime beats only 5.14%, memory beats only 8.53%

class Solution {
    public int mySqrt(int x) {
        if(x < 2)
            return x;
        long multiplied = 0;
        int count = 2;
        while(count <= x/2) {
            multiplied = (long)count*count;
            if(multiplied > x)
                return count - 1;
            count++;
        }
        return count - 1;
    }
}
