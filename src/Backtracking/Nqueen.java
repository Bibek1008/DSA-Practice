package Backtracking;

public class Nqueen {


    


    public static void main(String[] args) {


        int n =4;
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqeen(board,0);
        
    }

    private static void nqeen(char[][] board, int row) {

        int n=board.length;
        if(row==n){

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }  System.out.println();
            return;
        }
        for(int j=0;j<n;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
                nqeen(board,row+1);
                board[row][j]='.';

            }
        }



    }

    private static boolean issafe(char[][] board, int row, int column) {

        int n=board.length;

        //check rows
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q'){
                return false;

            }
        }
        for(int j=0;j<n;j++){
            if(board[j][column]=='Q'){
                return false;

            }
        }
        //for north east
        int i=row;
        int j=column;
        while (i>=0 && j<n){
            if (board[i][j]=='Q'){
                return false;

            }
            i--;
            j++;

        }
        //for north west
        i=row;
        j=column;
        while (i>=0 && j>=0){
            if (board[i][j]=='Q'){
                return false;

            }
            i--;
            j--;

        }
        i=row;
        j=column;
        //south east
        while (i<n && j<n){
            if (board[i][j]=='Q'){
                return false;

            }
            i++;
            j++;
        }
        i=row;
        j=column;
        //south west
        while (i<n && j>=0){
            if (board[i][j]=='Q'){
                return false;

            }
            i++;
            j--;

        }
        return true;
    }
}
