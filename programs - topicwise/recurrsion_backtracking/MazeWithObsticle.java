package recurrsion_backtracking;

import java.util.Arrays;

public class MazeWithObsticle {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = true;
            }
        }
        maze[1][1] = false;
        int r = 0;
        int c = 0;
        for(boolean[] m: maze){
           System.out.println(Arrays.toString(m));
        }
        path("", maze, r, c);
    }
    private static void path(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze.length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            path(p+'D', maze, r+1, c);
        }
        if(c<maze.length-1){
            path(p+'R', maze, r, c+1);
        }

    }
}
