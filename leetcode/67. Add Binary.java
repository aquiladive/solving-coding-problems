//67. Add Binary
//runtime only beats 16.67%, memory only beats 5.69%

class Solution {
    public String addBinary(String a, String b) {
        String sum = "";
        int carryover = 0;
        if(a.length() > b.length()) {
            while(b.length() < a.length()) {
                b = "0" + b;
            }
        }
        else {
            while(b.length() > a.length()) {
                a = "0" + a;
            }
        }
        for(int i = a.length()-1; i >= 0; i--) {
            if(a.charAt(i) == '1' && b.charAt(i) == '1') {
                if(carryover == 1)
                    sum = "1" + sum;
                else
                    sum = "0" + sum;
                carryover = 1;
            }
            else if(a.charAt(i) == '0' && b.charAt(i) == '0') {
                if(carryover == 1) {
                    sum = "1" + sum;
                }
                else {
                    sum = "0" + sum;
                }
                carryover = 0;
            }
            else {
                if(carryover == 1) {
                    sum = "0" + sum;
                }
                else {
                    sum = "1" + sum;
                    carryover = 0;
                }
            }
        }
        if(carryover == 1) {
            sum = "1" + sum;
        }
        return sum;
    }
}
