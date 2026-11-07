class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            char ch_nex=s.charAt(i+1);
            sum=sum+Math.abs(ch-ch_nex);
            System.out.println(sum);
        }
        return sum;
    }
}