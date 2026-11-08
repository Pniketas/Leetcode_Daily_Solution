class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> list=new ArrayList<>();
        int left1=0;
        int left2=0;
        while(left1<s1.length()){
            char ch1=s1.charAt(left1);
            char ch2=s2.charAt(left2);
            if(ch1 == ch2){
                left1++;
                left2++;
            }else{
                ArrayList<String> map=new ArrayList<>();
                int right1=left1;
                int right2=left2;
                String str1="";
                String str2="";
                while(right1<s1.length() && right2<s2.length() && s1.charAt(right1)!= s2.charAt(right2)){
                    char chr1=s1.charAt(right1);
                    char chr2=s2.charAt(right2);
                    str1=str1+chr1;
                    str2=str2+chr2;
                    right1++;
                    right2++;
                }
                map.add(str1);
                map.add(str2);
                list.add(map);
                left1=right1;
                left2=right2;
            }
        }
        return list;
    }
}