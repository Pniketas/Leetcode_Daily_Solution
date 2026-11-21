class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int ans[]=new int[friends.length];
        for(int ele:friends){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int i=0;
        for(int ele:order){
            if(map.containsKey(ele)){
                ans[i]=ele;
                map.put(ele,map.get(ele)-1);
                if(map.get(ele)==0){
                    map.remove(ele);
                }
                i++;
            }
        }
        return ans;
    }
}