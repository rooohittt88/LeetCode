class Solution {
    public int partitionString(String s) {
        int n=s.length();
        Set<Character> Hset=new HashSet<>();
        int cunt=1;
        for(char ch:s.toCharArray()){
            if(Hset.contains(ch)){
                cunt++;
                Hset.clear();
            }
            Hset.add(ch);
        }
        return cunt;
    }
}