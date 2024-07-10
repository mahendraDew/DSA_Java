package recurrsion_backtracking;

import java.util.Arrays;

public class MazeAllPath_backtracking {
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
        pathAll("", maze, r, c);
    }
    private static void pathAll(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze.length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        
        if(r < maze.length-1){
            pathAll(p+'D', maze, r+1, c);
        }
        if(c < maze.length-1){
            pathAll(p+'R', maze, r, c+1);
        }
        if(r > 0){
            pathAll(p+'U', maze, r-1, c);
        }
        if(c > 0){
            pathAll(p+'L', maze, r, c-1);
        }

        maze[r][c] = true;
    }
}
