class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        
        for (int num : nums) {
            sum = sum + encrypt(num);
        }
        
        return sum;
    }
    public int encrypt(int num) {
        int maxDigit = 0;
        int placeholder = 0;
        
        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            placeholder = placeholder * 10 + 1; 
            num /= 10;
        }
        
        return maxDigit * placeholder;
    }
}
