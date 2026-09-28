class Solution {
    public int maxDepth(String s) {
        int counter=0;
        int maxcounter=0;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch=='(') counter++; 
            else if(ch==')') counter--;
            maxcounter=Math.max(maxcounter,counter); 
        }
        return maxcounter;
    }
}