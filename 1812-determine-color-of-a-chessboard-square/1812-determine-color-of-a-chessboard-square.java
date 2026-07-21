class Solution {
    public boolean squareIsWhite(String coordinates) {
        int col=coordinates.charAt(0);
        int row=coordinates.charAt(1);
        int sum=col+row;
        if(sum%2==0) return false;
        else return true;
    }
}