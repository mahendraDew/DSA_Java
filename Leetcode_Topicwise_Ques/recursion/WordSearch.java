package Leetcode_Topicwise_Ques.recursion;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
    public static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(existPathBacktracking(board, word, visited, i, j, 0)){
                        return true;
                    }
                }
            }
        }

        return false;
    }
    public static boolean existPathBacktracking(char[][] board, String word, boolean[][] visited, int r, int c, int indx){
        if(indx == word.length()){
            return true;
        }
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length || visited[r][c] || word.charAt(indx) != board[r][c]){
            return false;
        }

        visited[r][c] = true;
        if(existPathBacktracking(board, word, visited, r+1, c, indx+1) ||    //down
            existPathBacktracking(board, word, visited, r, c+1, indx+1) ||   //right
            existPathBacktracking(board, word, visited, r-1, c, indx+1) ||   //up
            existPathBacktracking(board, word, visited, r, c-1, indx+1) ){   //left
                return true;
            }
        visited[r][c] = false;
        return false;
    }
}
