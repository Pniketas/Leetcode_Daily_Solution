class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int start=0;
        int end=nums.length-1;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int ele: nums){
            if(ele<pivot){
                list1.add(ele);
            }else if(ele==pivot){
                list2.add(ele);
            }else{
                list3.add(ele);
            }
        }
       ArrayList<Integer> marge=new ArrayList<>(list1);
       marge.addAll(list2);
       marge.addAll(list3);
       int ans[]=new int[marge.size()];
       for (int i = 0; i < marge.size(); i++) {
            ans[i] = marge.get(i);
        }
        return ans;
    }
}