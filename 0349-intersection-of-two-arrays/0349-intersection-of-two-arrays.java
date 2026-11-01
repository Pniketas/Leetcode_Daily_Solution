class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();
        HashSet<Integer> map1 = new HashSet<>();        
        for (int i = 0; i < nums1.length; i++) {
            map.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            map1.add(nums2[i]);
        }
        map.retainAll(map1);
        return map.stream().mapToInt(Integer::intValue).toArray();
    }
}
