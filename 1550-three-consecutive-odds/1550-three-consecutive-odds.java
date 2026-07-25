class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int i = 0;
        int counter = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter == 3)
                return true;
        }
        return false;
    }

}