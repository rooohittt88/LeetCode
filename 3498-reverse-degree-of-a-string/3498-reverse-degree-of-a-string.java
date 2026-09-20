class Solution {
    public int reverseDegree(String s) {
        int degre=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int rev = 26 - (ch - 'a');
            int str = i + 1;
            degre+=rev*str;
        }
        return degre;
    }
}