//28. Find the Index of the First Occurrence in a String
//runtime beats only 19.18%, memory beats 66.33%

class Solution {
    public int strStr(String haystack, String needle) {
        int count = 0, index = -1, charIndex = 0;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(count)) {
                count++;
                if(count == 1)
                    charIndex = i;
            }
            else if(count != 0) {
                count = 0;
                i = charIndex;
            }
            if(count == needle.length()) {
                index = charIndex;
                break;
            }
        }
        return index;
    }
}
