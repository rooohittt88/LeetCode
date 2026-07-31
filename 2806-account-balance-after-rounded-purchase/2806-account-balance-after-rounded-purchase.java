class Solution {
    public int accountBalanceAfterPurchase(int n) {
        int ans=Math.round(n/10.0f);
        return 100-(ans*10);
    }
}