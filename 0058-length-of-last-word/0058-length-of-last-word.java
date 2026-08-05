class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            char right = s.charAt(i);
            if (right == ' ') {
                if (count > 0) {
                    return count;
                }
                continue;
            } else
                count++;

        }
        return count;
    }
}