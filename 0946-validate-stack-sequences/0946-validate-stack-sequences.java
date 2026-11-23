class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> st=new ArrayDeque<>();
        int left=0;
        int right=0;
        while(left<pushed.length){
            st.push(pushed[left]);
            while(right<popped.length && !st.isEmpty() &&  st.peek()==popped[right]){
                st.pop();
                right++;
            }
            left++;
        }
        return st.isEmpty();
    }
}