class Solution {
    public boolean isValid(String s) {
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char last= s.charAt(i);
                char top=st.pop();
                if( (top=='(' && last!=')') || (top=='{' && last!='}') || (top=='[' && last!=']')) return false;
                
            }
        }
        return st.isEmpty();
    }
}