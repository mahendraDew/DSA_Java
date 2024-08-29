package recurrsion_backtracking;

public class KnightTour {
    static int N = 8;

    public static boolean solveKT(){
        int[][] sol = new int[8][8];
        for(int i = 0; i<sol.length; i++){
            for(int j = 0; j<sol.length; j++){
                sol[i][j] = -1;
            }
        }

        int xMove[] = {2,1,-1,-2,-2,-1, 1, 2};
        int yMove[] = {1,2, 2, 1,-1,-2,-2,-1};

        sol[0][0] = 0;
        if(!solveKTutil(0,0,1,sol,xMove, yMove)){
            System.out.println("Solution does not exits!!");
            return false;
        }else{
            printSolution(sol);
        }
        return true;
    }

    public static boolean solveKTutil(int x, int y, int iMove, int[][] sol, int[] xMove, int[] yMove){
        if(iMove == N*N){
            return true;
        }

        int nextX, nextY;
        for(int i = 0; i<8; i++){
            nextX = x + xMove[i];
            nextY = y + yMove[i];
            if(isSafe(nextX, nextY, sol)){
                sol[nextX][nextY] = iMove;
                if(solveKTutil(nextX, nextY, iMove+1, sol, xMove, yMove)){
                    return true;
                }else{
                    sol[nextX][nextY] = -1;
                }
            }
        }

        return false;
    }

    public static boolean isSafe(int x, int y, int[][] sol){
        return (x>=0 && x<N && y>=0 && y<N && sol[x][y] == -1);
    }    
    
    public static void printSolution(int[][] board){
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solveKT();
    }
}
