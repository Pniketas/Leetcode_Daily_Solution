class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int rev=((int)ch-'a');
            rev=Math.abs(rev-26);
            System.out.println(rev);
            sum=sum+(rev*(i+1));
        }
        return sum;
    }
}