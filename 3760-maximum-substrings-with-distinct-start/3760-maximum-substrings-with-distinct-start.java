class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> map=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.add(ch);
        }
        return map.size();
    }
}