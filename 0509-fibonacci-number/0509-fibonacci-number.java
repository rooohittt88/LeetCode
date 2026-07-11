class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int z=0;
        int f=1;
        int nt=0;
        for(int i=2;i<=n;i++){
        nt=z+f;
        z=f;
        f=nt;}
        return nt;
    }
}