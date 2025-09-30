//1935. Maximum Number of Words You Can Type
//beats 89.67% of solutions in runtime, beats 74.30% of solutions in memory

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int wordCount = 0;
        String[] words = text.split(" ");
        for(int i = 0; i < words.length; i++) {
            String check = words[i];
            for(int j = 0; j < check.length(); j++) {
                if(brokenLetters.indexOf(check.charAt(j)) != -1)
                    break;
                if(j == check.length() - 1)
                    wordCount++;
            }
        }
        return wordCount;
    }
}
