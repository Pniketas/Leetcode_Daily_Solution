class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int left = 0;
        int right = 0;
        while (left < g.length && right < s.length) {
            if (g[left] <= s[right]) {
                left++;
                right++;
            } else if (g[left] > s[right]) {
                right++;
            }
        }
        return left;
    }
}