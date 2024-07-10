package recurrsion_backtracking;

import java.util.Arrays;

public class MazePrintMatrixPrintPath {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = true;
            }
        }
        
        int r = 0;
        int c = 0;
        for(boolean[] m: maze){
           System.out.println(Arrays.toString(m));
        }
        int[][] path = new int[maze.length][maze[0].length];
        pathAll("", maze, r, c, path, 1);
    }
    private static void pathAll(String p, boolean[][] maze, int r, int c, int[][] path, int steps){
        if(r == maze.length-1 && c == maze.length-1){
            path[r][c] = steps;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = steps;
        
        if(r < maze.length-1){
            pathAll(p+'D', maze, r+1, c, path, steps+1);
        }
        if(c < maze.length-1){
            pathAll(p+'R', maze, r, c+1, path, steps+1);
        }
        if(r > 0){
            pathAll(p+'U', maze, r-1, c, path, steps+1);
        }
        if(c > 0){
            pathAll(p+'L', maze, r, c-1, path, steps+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
