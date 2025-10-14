//6. Zigzag Conversion
//runtime beats only 20.44%, memory only beats 33.22%

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;

        int count = 0;
        int shift = 0;
        numRows -= 1;
        String zigzag = "";
        for(int i = 0; i <= numRows; i++) {
            count = i;
            if(i == 0 || i == numRows) {
                while(count < s.length()) {
                    zigzag += Character.toString(s.charAt(count));
                    count += 2*(numRows);
                }
            }
            else {
                shift = 2*(numRows-i);
                while(count < s.length()) {
                    zigzag += Character.toString(s.charAt(count));
                    count += shift;
                    if(shift == 2*(numRows-i)) {
                        int opposite = numRows - i;
                        shift = 2*(numRows-opposite);
                    }
                    else {
                        shift = 2*(numRows-i);
                    }
                }
            }
        }
        return zigzag;
    }
}
