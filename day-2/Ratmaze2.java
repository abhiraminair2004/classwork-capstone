package demo2;

public class Ratmaze2 {

    static void solve(int[][] maze, int i, int j, String path, boolean[][] visited) {
        int n = maze.length;

        // boundary + blocked + visited check
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || visited[i][j]) {
            return;
        }

        // destination reached
        if (i == n - 1 && j == n - 1) {
            System.out.println(path);
            return;
        }

        // mark visited
        visited[i][j] = true;

        // move in 4 directions
        solve(maze, i + 1, j, path + "D", visited); // Down
        solve(maze, i, j - 1, path + "L", visited); // Left
        solve(maze, i, j + 1, path + "R", visited); // Right
        solve(maze, i - 1, j, path + "U", visited); // Up

        // backtrack
        visited[i][j] = false;
    }

    public static void main(String[] args) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 1, 0},
            {1, 1, 1, 1}
        };

        boolean[][] visited = new boolean[maze.length][maze.length];

        solve(maze, 0, 0, "", visited);
    }
}