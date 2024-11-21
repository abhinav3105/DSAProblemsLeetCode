class Solution {

    private static final int UNGUARDED = 0;
    private static final int GUARDED = 1;
    private static final int GUARD = 2;
    private static final int WALL = 3;

    private void dfs(int row, int col, int[][] grid, char direction) {
        if (
            row < 0 ||
            row >= grid.length ||
            col < 0 ||
            col >= grid[0].length ||
            grid[row][col] == GUARD ||
            grid[row][col] == WALL
        ) {
            return;
        }
        grid[row][col] = GUARDED; 
        if (direction == 'U') dfs(row - 1, col, grid, 'U'); 
        if (direction == 'D') dfs(row + 1, col, grid, 'D'); 
        if (direction == 'L') dfs(row, col - 1, grid, 'L'); 
        if (direction == 'R') dfs(row, col + 1, grid, 'R'); 
    }

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = GUARD;
        }

        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = WALL;
        }

        for (int[] guard : guards) {
            dfs(guard[0] - 1, guard[1], grid, 'U'); 
            dfs(guard[0] + 1, guard[1], grid, 'D'); 
            dfs(guard[0], guard[1] - 1, grid, 'L'); 
            dfs(guard[0], guard[1] + 1, grid, 'R'); 
        }

        int count = 0;
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == UNGUARDED) count++;
            }
        }
        return count;
    }
}