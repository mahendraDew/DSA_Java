package TicTacToe;
import java.util.Scanner;



public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            if(isBoardFull(board)){
                System.out.println("No place left! No one wins !!");
                return;
            }
            System.out.println("Enter player " + player + ":");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if(gameOver){
                    printBoard(board);
                    System.out.println("Player " + player + " won the game!");
                    return;
                }else{
                    player = (player == 'X')? 'O' : 'X';
                }

            }else{
                System.out.println("Invalid move, Try again!!");
            }
        }

        printBoard(board);
        
    }
    private static boolean haveWon(char[][] board, char player){
        //row
        for (int row = 0; row < board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }

        //col
        for (int col = 0; col < board.length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }

        //diagonal 
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }
    private static boolean isBoardFull(char[][] board){
        int count = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if(board[row][col] == 'X' || board[row][col] == 'O'){
                    count++;
                }
            }
        }
        if(count == board.length * board[0].length){
            return true;
        }
        return false;
    }
    private static void printBoard(char[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
