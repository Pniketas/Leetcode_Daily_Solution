class Solution {
    public int[] findDegrees(int[][] matrix) {
        int ans[]=new int[matrix.length];
        for(int col=0;col<matrix.length;col++){
            int sum=0;
            for(int row=0;row<matrix.length;row++){
                sum=sum+matrix[row][col];
            }
            ans[col]=sum;
        }
        return ans;
    }
}