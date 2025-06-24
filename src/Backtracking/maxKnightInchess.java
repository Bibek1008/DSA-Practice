package Backtracking;

public class maxKnightInchess {


    static int maxKnight=-1;
    static boolean issafe(char [][]grid,int row,int col){
        int n=grid.length;
//        //base case
//        if(grid[row][col]==n*n-1){
//            return true;
//        }

        int i,j;
        i=row-2;
        j=col+1;

        //2 up 1 right
        if(i>=0 && j<n && grid[i][j]=='K'){return false;
        }
        //2 up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && grid[i][j]=='K'){return false;
        }

        //down


        //2 down 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]=='K'){return false;
        }
        //2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && grid[i][j]=='K'){return false;
        }

        //diagnal checking right
        //2 right 1 up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && grid[i][j]=='K'){return false;
        }

        //2 right 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]=='K'){return false;
        }


        //diagnal checking left
        //2 left 1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j]=='K'){return false;
        }

        //2 left 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && grid[i][j]=='K'){return false;
        }
        return true;

    }
    public static  void helper(char [][]grid,int row,int col,int num){
        int n=grid.length;
        //base case
        if(row==n){

//            for(int i=0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    System.out.print(grid[i][j]+" ");
//                }
//                System.out.println();
//            }  System.out.println();
            maxKnight=Math.max(maxKnight,num);
            return;
        }
        else if(issafe(grid,row,col)){
            grid[row][col]='K';
            if (col!=n-1) {
                helper(grid, row, col + 1, num + 1);
            }
            else{
                helper(grid, row+1,0, num + 1);
            }
            grid[row][col]='x';
        }

        if (col!=n-1) {
            helper(grid, row, col + 1, num );
        }
        else{
            helper(grid, row+1,0, num );
        }


    }
    public static void main(String[] args) {
        int n=2;
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        helper(board,0,0,0);
        System.out.println("The maximum neight is "+maxKnight);

    }
}
