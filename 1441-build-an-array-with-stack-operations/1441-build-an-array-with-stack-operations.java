class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String>list=new ArrayList<>();
        int i=0;
        int x=1;
        while(i<target.length){
            if(target[i]==x){
                list.add("Push");
                x++;
                i++;
            }else{
                list.add("Push");
                list.add("Pop");
                x++;
            }
        }
        return list;
    }
}