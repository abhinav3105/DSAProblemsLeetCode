class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        int mat[][] = new int[m][n];
        if(arr.length!= m*n) return new int[0][0];
        int k = 0;
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                mat[i][j] = arr[k];
                k++;
            }
        }
        return mat;
    }
}