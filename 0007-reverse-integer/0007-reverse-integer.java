import java.util.*;

class Solution {
    public int reverse(int x) {
        int sign = (x < 0) ? -1 : 1; 
        long temp = Math.abs((long) x);
        long sum = 0;
        while (temp > 0) {
            int rem = (int) (temp % 10);
            sum = (sum * 10) + rem;
            temp = temp / 10;
        }
        long finalResult = sum * sign;
        if (finalResult < Integer.MIN_VALUE || finalResult > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) finalResult;
    }
}
