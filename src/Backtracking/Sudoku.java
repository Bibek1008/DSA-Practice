package Backtracking;

public class Sudoku {


        public static boolean isvalid(char[][] board,int row,int col,char ch){
            //row checking
            for(int i=0;i<9;i++){
                if(board[row][i]==ch){
                    return false;
                }
            }
            //column checking
            for(int i=0;i<9;i++){
                if(board[i][col]==ch){
                    return false;
                }
            }
            int i=row/3;
            int y=col/3;
            i=i*3;
            y=y*3;
            for(int x=i;x<i+3;x++){

                for(int j=y;j<y+3;j++){


                    if(board[x][j]==ch){
                        return false;
                    }

                }
            }
            return true;

        }
        public boolean isValidSudoku(char[][] board) {

            for(int i=0;i<9;i++){

                for(int j=0;j<9;j++){

                    char ch=board[i][j];
                    if(ch=='.') continue;
                    board[i][j]='.';
                    if(isvalid(board,i,j,ch)==false){
                        return false;
                    }
                    board[i][j]=ch;

                }
            }
            return true;

        }

    public static void main(String[] args) {

    }
}
