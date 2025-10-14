//7. Reverse Integer
//runtime beats only 2.72%, memory beats only 5.27%

class Solution {
    public int reverse(int x) {
        String s = "";
        if(x < 0) {
            s += "-";
            x *= -1;
        }
        while(x > 0) {
            s += (x % 10);
            x = x/10;
        }
        try {
            int reverse = Integer.parseInt(s);
            return reverse;
        }
        catch(NumberFormatException e) {
            return 0;
        }
    }
}

//second solution
//more elegent, slightly more efficient
//runtime beats only 3.09%, memory beats only 34.56%

class Solution {
    public int reverse(int x) {
        String s = "";
        if(x < 0) {
            x *= -1;
            s += "-";
        }
        s += new StringBuilder(Integer.toString(x)).reverse().toString();
        try {
            int reverse = Integer.parseInt(s);
            return reverse;
        }
        catch(NumberFormatException e) {
            return 0;
        }
    }
}

//third solution
//runtime beats 81.28%, memory only beats 5.27%

class Solution {
    public int reverse(int x) {
        boolean negative = false;
        int count = 0;
        if(x < 0) {
            negative = true;
            x *= -1;
        }
        int copy = x;
        int reverse = 0;
        while(x > 0) {
            reverse = (reverse * 10) + x % 10;
            x = x/10;
            count++;
        }
        if(reverse < 0)
            return 0;
        if(count == 10) {
            int reverseCopy = reverse;
            for(int i = count-1; i > 0; i--) {
                if((copy % 10) != (int)(reverseCopy/(Math.pow(10, i))))
                    return 0;
                copy = copy/10;
                reverseCopy = reverseCopy % (int)(Math.pow(10, i));
            }
        }

        if(negative)
            reverse *= -1;
        return reverse;
    }
}

//cleaning up third solution to improve memory
//runtime beats 81.27%, memory beats 73.30%

class Solution {
    public int reverse(int x) {
        int count = 0;
        int copy = x;
        if(x < 0) {
            x *= -1;
        }
        int reverse = 0;
        while(x > 0) {
            reverse = (reverse * 10) + x % 10;
            x = x/10;
            count++;
        }
        if(reverse < 0)
            return 0;
        if(copy < 0)
            reverse *= -1;
        if(count == 10) {
            if(reverseFail(reverse, copy, count))
                return 0;
        }
        return reverse;
    }

    public boolean reverseFail(int reverse, int x, int count) {
        for(int i = count-1; i > 0; i--) {
            if((x % 10) != (int)(reverse/(Math.pow(10, i))))
                return true;
            x = x/10;
            reverse = reverse % (int)(Math.pow(10, i));
        }
        return false;
    }
}

