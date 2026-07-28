import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int halfLen = n / 2;
        char[] halfChars = new char[halfLen];
        for (int i = 0; i < halfLen; i++) {
            halfChars[i] = s.charAt(i);
        }
        Arrays.sort(halfChars);
        String sortedHalf = new String(halfChars);
        String reversed = new StringBuilder(sortedHalf).reverse().toString();
        if (n % 2 != 0) {
            return sortedHalf + s.charAt(halfLen) + reversed;
        } else {
            return sortedHalf + reversed;
        }
    }
}
