//65. Valid Number
//incomplete, in process of solving but not solved

class Solution {
    public boolean isNumber(String s) {
        String copy = s.toLowerCase();
        boolean check = true;
        if(copy.charAt(0) == '-' || copy.charAt(0) == '+' || Character.isDigit(copy.charAt(0)) || (copy.charAt(0) == '.' && copy.length() > 1 && Character.isDigit(copy.charAt(1)))) {
            for(int i = 1; i < copy.length(); i++) {
                if(copy.charAt(i) == 'e') {
                    String[] byE = copy.split("e");
                    if(byE.length != 2)
                        return false;
                    check = eCheck(byE[1]);
                    break;
                }
                if(copy.charAt(i) == '.') {
                    if(i == copy.length()-1)
                        return true;
                    String[] decimal = copy.split("\\.");
                    if(decimal.length != 2)
                        return false;
                    check = decimalCheck(decimal[1]);
                    break;
                }
                if(!Character.isDigit(copy.charAt(i)))
                    return false;
            }
            return check;
        }
        else
            return false;
    }

    public boolean eCheck(String s) {
        if(Character.isLetter(s.charAt(0)) || s.charAt(0) == '.')
            return false;
        for(int i = 1; i < s.length(); i++)
            if(!Character.isDigit(s.charAt(i)))
                return false;
        return true;
    }

    public boolean decimalCheck(String s) {
        for(int i = 0; i < s.length(); i++)
            if(!Character.isDigit(s.charAt(i)))
                return false;
        return true;
    }
}
