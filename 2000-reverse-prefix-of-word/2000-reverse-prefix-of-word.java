class Solution {
    public String reversePrefix(String word, char ch) {
        Deque<Character> st=new ArrayDeque<>();
        int i=0;
        String ans="";
        while(i<word.length() && word.charAt(i)!=ch){
            st.push(word.charAt(i));
            i++;
        }
        System.out.println(i);
        if(i<word.length()){
            st.push(word.charAt(i));
            while(!st.isEmpty()){
                ans=ans+st.pop();
                
            }
            for(int j=i+1;j<word.length();j++){
                char ch1=word.charAt(j);
                ans=ans+ch1;
            }
            return ans;
        }else{
            return word;
        }
    }
}