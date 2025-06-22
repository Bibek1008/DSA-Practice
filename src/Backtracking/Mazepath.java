package Backtracking;

public class Mazepath {

    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;

        int count = maze(1, 1, rows, cols, "");
        System.out.println("Total paths: " + count);
    }

    private static int maze(int sr, int sc, int er, int ec, String path) {
        if (sr > er || sc > ec) {
            return 0;
        }
        if (sr == er && sc == ec) {
            System.out.println(path);
            return 1;
        }

        // Move down
        int downWays = maze(sr + 1, sc, er, ec, path + "D");

        // Move right
        int rightWays = maze(sr, sc + 1, er, ec, path + "R");

        return downWays + rightWays;
    }
}
//DRR
//RDR
//RRD
//Total paths: 3