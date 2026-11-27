class Solution {
    public int findPermutationDifference(String s, String t) {
        int total=0;
        for(int i=0;i<s.length();i++){
            char s_ch=s.charAt(i);
            int last=0;
            for(int j=0;j<s.length();j++){
                char t_ch=t.charAt(j);
                if(s_ch==t_ch){
                    last=j;
                    break;
                }
            }
            total=total+Math.abs(i-last);
        }
        return total;
    }
}