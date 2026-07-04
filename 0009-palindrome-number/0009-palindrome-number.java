class Solution {
    public static boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;
        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if (rev == original) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        //    boolean ans=palin();
        System.out.println(isPalindrome(122));
    }
}