package demo2;

public class Ratmaze {

    static int N = 4;

    static void printSolution(boolean sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print((sol[i][j] ? 1 : 0) + " ");
            System.out.println();
        }
    }

    static boolean isSafe(int maze[][], int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    static boolean solveMazeUtil(int maze[][], int x, int y, boolean sol[][]) {

        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = true;
            return true;
        }

        if (isSafe(maze, x, y)) {

            sol[x][y] = true;

            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;

            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;

            sol[x][y] = false;
            return false;
        }

        return false;
    }

    static void solveMaze(int maze[][]) {
        boolean sol[][] = new boolean[N][N];

        if (!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.println("No solution exists");
            return;
        }

        printSolution(sol);
    }

    public static void main(String[] args) {

        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 1, 0},
            {1, 1, 1, 1}
        };

        solveMaze(maze);
    }
}