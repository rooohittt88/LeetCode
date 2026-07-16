class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String[] words = text.split(" ");
        int typeableCount = 0;

        for (String word : words) {
            boolean canType = true;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (brokenLetters.indexOf(ch) != -1) {
                    canType = false;
                    break;
                }
            }

            if (canType) {
                typeableCount++;
            }
        }

        return typeableCount;
    }
}