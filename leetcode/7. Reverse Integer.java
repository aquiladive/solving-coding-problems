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
