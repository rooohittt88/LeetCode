class Solution {
    public String restoreString(String s, int[] indices) {
        int n=indices.length;
        char[] temp=new char[n];
        for(int i=0;i<n;i++){
            temp[indices[i]]=s.charAt(i);
        }
        return new String(temp);
    }
}