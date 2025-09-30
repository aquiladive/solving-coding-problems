//1935. Maximum Number of Words You Can Type
//beats 25.91% of solutions in runtime, beats 9.26% of solutions in memory

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int wordCount = 0;
        String[] words = text.split(" ");
        for(int i = 0; i < words.length; i++) {
            String check = words[i];
            for(int j = 0; j < check.length(); j++) {
                char[] character = new char[1];
                character[0] = check.charAt(j);
                String checkChar = new String(character);
                if(brokenLetters.contains(checkChar))
                    break;
                if(j == check.length() - 1)
                    wordCount++;
            }
        }
        return wordCount;
    }
}
