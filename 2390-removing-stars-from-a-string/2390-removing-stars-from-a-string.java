class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='*') {
                stack.pop();
                continue;
            }
            stack.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        for (char ch:stack) sb.append(ch);
        String result=sb.toString();
        return result;
    }
}