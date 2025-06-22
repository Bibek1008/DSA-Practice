package Backtracking;

public class Mazepath_4dir {





    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean [][] isvisited=new boolean[rows][cols];
        int count = maze(0, 0, rows-1, cols-1, "",isvisited);
        System.out.println("Total paths: " + count);
    }

    private static int maze(int sr, int sc, int er, int ec, String path,boolean [][] isvisited) {
        if (sr > er || sc > ec) {
            return 0;
        }
        if(sr<0 || sc<0){
            return 0;
        }
        if(isvisited[sr][sc]){
            return 0;
        }
        if (sr == er && sc == ec) {
            System.out.println(path);
            return 1;
        }
        isvisited[sr][sc]=true;
        // Move right
        int rightWays = maze(sr, sc + 1, er, ec, path + "R",isvisited);
        // Move down
        int downWays = maze(sr + 1, sc, er, ec, path + "D",isvisited);
        // Move left
        int leftWays = maze(sr, sc - 1, er, ec, path + "L",isvisited);

        // Move up
        int upWays = maze(sr - 1, sc, er, ec, path + "U",isvisited);
        isvisited[sr][sc]=false;



        return downWays + rightWays+leftWays+upWays;
    }
}


//RRDD
//RRDLDR
//RRDLLDRR
//RDRD
//RDDR
//RDLDRR
//DRRD
//DRDR
//DRURDD
//DDRR
//DDRURD
//DDRUURDD
//Total paths: 12
