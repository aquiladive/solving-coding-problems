//58. Length of Last Word
//beats 28.85% in runtime, 10.19% in memory

class Solution1 {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}

//second solution
//less elegant, more efficient
//runtime beats 100%, memory beats 91.60%

class Solution2 {
    public int lengthOfLastWord(String s) {
        int wordLength = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) != ' ')
                wordLength++;
            else if(wordLength != 0)
                break;
        }
        return wordLength;
    }
}
