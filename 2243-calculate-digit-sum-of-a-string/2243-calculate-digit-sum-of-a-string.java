class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder ans = new StringBuilder();
            int left = 0;
            int sum = 0;
            for (int right = 0; right < s.length(); right++) {
                sum += s.charAt(right) - '0';   
                if (right - left + 1 == k) {
                    ans.append(sum);
                    sum = 0;
                    left = right + 1;
                }
            }
            if (left < s.length()) {
                ans.append(sum);
            }
            s = ans.toString();
        }
        return s;
    }
}
