// 8. String to Integer (atoi)
// incomplete solution

class Solution {
    public int myAtoi(String s) {
        boolean zeroPresent = true;
        String conversion = "";
        s.trim();
        if(s.charAt(0) == '-') {
            conversion += '-';
        }
        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                if(zeroPresent && s.charAt(i) == '0');
                else {
                    conversion += s.charAt(i);
                }
            }
            else if(Character.isLetter(s.charAt(i)))
                break;
        }
        try {
            return Integer.parseInt(conversion);
        }
        catch(NumberFormatException e) {
            return 0;
        }
    }
}
