class Solution {
    public int smallestNumber(int n, int t) {
        while (n>0) {
            int org = n;
            int product = 1;
            while (org > 0) {
                int digit = org % 10;
                product = product * digit;
                org = org / 10;
            }
            if (product % t == 0) {
                return n;
            }
            n++;
        }
        return n;
    }
}
