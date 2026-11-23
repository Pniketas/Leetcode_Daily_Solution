class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st=new ArrayDeque<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                int doubled=st.peek()*2;
                st.push(doubled);
            }else if(operations[i].equals("+")){
                int first=st.pop();
                int second=st.pop();
                st.push(second);
                st.push(first);
                st.push(first+second);
            }else{
                int n=Integer.parseInt(operations[i]);
                st.push(n);
            }
        }
        while(!st.isEmpty()){
            int curr=st.pop();
            sum=sum+curr;
        }
        return sum;
    }
}