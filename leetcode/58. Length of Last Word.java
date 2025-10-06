//58. Length of Last Word
//beats 28.85% in runtime, 10.19% in memory

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
