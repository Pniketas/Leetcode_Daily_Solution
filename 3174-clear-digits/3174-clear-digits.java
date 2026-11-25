class Solution {
    public String clearDigits(String s) {
        Deque<Character>st=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && Character.isDigit(ch)){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.removeLast());
        }
        return new String(ans);
    }
}