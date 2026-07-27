class Solution {
    public int sum_week(int week){ 
       int sum=(7*(2*week+6))/2;
       return sum;
    }
    public int totalMoney(int n) {
        int week=n/7;
        int days=n%7;
        int summ=0;
        int count=1;
        for(int i=1;i<=week;i++){
            summ+=sum_week(i);
            count++;
        }
        for(int i=0;i<days;i++){
            summ+=count;
            count++;
        }

        return summ;
    }
}