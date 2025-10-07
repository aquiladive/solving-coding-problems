//28. Find the Index of the First Occurrence in a String
//runtime beats only 19.18%, memory beats 66.33%

class Solution1 {
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

//second solution, using in-built function
//runtime beats 100%, memory beats 90.67%

class Solution2 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
