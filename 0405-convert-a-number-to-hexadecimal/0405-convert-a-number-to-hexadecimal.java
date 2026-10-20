class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        char[] ch="0123456789abcdef".toCharArray();
        StringBuilder ans=new StringBuilder();
        while(num!=0) {
            ans.append(ch[num&0xF]);
            num>>>= 4;
        }
        return ans.reverse().toString();
    }
}
