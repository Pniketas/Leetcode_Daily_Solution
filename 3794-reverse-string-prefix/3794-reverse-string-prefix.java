class Solution {
    public String reversePrefix(String s, int k) {
        if (k <= 1) return s;
        
        char[] arr = s.toCharArray();
        for (int i = 0; i < k / 2; i++) {
            char ch = arr[i];
            arr[i] = arr[k - 1 - i];
            arr[k - 1 - i] = ch;
        }        
        return new String(arr);
    }
}
