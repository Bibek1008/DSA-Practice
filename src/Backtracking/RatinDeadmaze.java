package Backtracking;

public class RatinDeadmaze {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        int [][]maze={
                {1,0,1,1,1,1},
                {1,1,1,1,0,1},
                {0,1,1,1,1,1},
                {0,0,1,0,1,1}
        };
        int count = maze(0, 0, rows-1, cols-1, "",maze);
        System.out.println("Total paths: " + count);
    }

    private static int maze(int sr, int sc, int er, int ec, String path,int [][]maze) {
        if (sr > er || sc > ec) {
            return 0;
        }
        if (sr == er && sc == ec) {
            System.out.println(path);
            return 1;
        }
        if(maze[sr][sc]==0){
            return 0;
        }
        // Move down
        int downWays = maze(sr + 1, sc, er, ec, path + "D",maze);

        // Move right
        int rightWays = maze(sr, sc + 1, er, ec, path + "R",maze);

        return downWays + rightWays;
    }
}
