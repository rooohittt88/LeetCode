class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int countZeros = 1;
        for (int plot : flowerbed) {
            if (plot == 0) {
                countZeros++;
                if (countZeros == 3) {
                    n--;
                    countZeros = 1;
                }
            } else {
                countZeros = 0;
            }
            if (n <= 0) return true;
        }
        if (flowerbed[flowerbed.length - 1] == 0) { 
            countZeros++;
            if (countZeros == 3) {
                n--;
            }
        }

        return n <= 0;
    }
}
