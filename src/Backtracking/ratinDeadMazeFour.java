package Backtracking;

public class ratinDeadMazeFour {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int [][] maze = {
                {1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1}
        };
        int count = maze(0, 0, rows - 1, cols - 1, "", maze);
        System.out.println("Total paths: " + count);
    }

    private static int maze(int sr, int sc, int er, int ec, String path, int[][] maze) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec) {
            return 0;
        }

        if (maze[sr][sc] == 0 || maze[sr][sc] == -1) {
            return 0;
        }

        if (sr == er && sc == ec) {
            System.out.println(path);
            return 1;
        }



        maze[sr][sc] = -1; // mark visited

        int rightWays = maze(sr, sc + 1, er, ec, path + "R", maze);
        int downWays = maze(sr + 1, sc, er, ec, path + "D", maze);
        int leftWays = maze(sr, sc - 1, er, ec, path + "L", maze);
        int upWays = maze(sr - 1, sc, er, ec, path + "U", maze);

        maze[sr][sc] = 1; // unmark (backtrack)

        return rightWays + downWays + leftWays + upWays;
    }




}
