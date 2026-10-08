class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        boolean[] arr=new boolean[n];
        Arrays.fill(arr, false);
        int max = candies[0]; 
        for(int i=1;i<n;i++) max=Math.max(max,candies[i]);
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                arr[i]=true;
            }
        }
        List<Boolean> result=new ArrayList<>();
        for(boolean value:arr) result.add(value);
        return result;
    }
}