class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1_arr[]=new int[26];
        int s2_arr[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            s1_arr[ch-'a']++;
        }
        int left=0;
        for(int right=0;right<s2.length();right++){
            char r_ch=s2.charAt(right);
            s2_arr[r_ch-'a']++;
            if(right-left+1==s1.length()){
                char l_ch=s2.charAt(left);
                if(Arrays.equals(s1_arr,s2_arr)){
                    return true;
                }
                s2_arr[l_ch-'a']--;
                left++;
            }
        }
        return false;
    }
}