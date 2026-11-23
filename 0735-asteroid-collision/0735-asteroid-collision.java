class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();
        for (int ele : asteroids) {
            if (ele >= 0) {
                st.push(ele);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(ele)) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == Math.abs(ele)) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(ele);
                }
            }
        }
        int[] ans = new int[st.size()];
        int i = 0;
        while (!st.isEmpty()) {
            ans[i] = st.removeLast();
            i++;
        }
        return ans;
    }
}
