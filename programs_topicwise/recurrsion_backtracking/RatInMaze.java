package recurrsion_backtracking;

import java.util.ArrayList;

public class RatInMaze {
    static String direction = "DLRU";
    static int[] dr = {1, 0, 0, -1};
    static int[] dc = {0, -1, 1, 0};

    public static boolean isValid(int row, int col, int[][] maze, int n){
        return row >=0 && col >= 0 && row<n && col<n && maze[row][col] == 1;
    }

    public static void findPath(int row, int col, int[][] maze, int n, ArrayList<String> ans, StringBuilder currPath){
        if(row == n-1 && col == n-1){
            ans.add(currPath.toString());
            return;
        }
        maze[row][col] = 0;
        for(int i = 0; i<4; i++){
            int nextrow = row + dr[i];
            int nextcol = col + dc[i];
            if(isValid(nextrow, nextcol, maze, n)){
                currPath.append(direction.charAt(i));
                findPath(nextrow, nextcol, maze, n, ans, currPath);
                currPath.deleteCharAt(currPath.length()-1);
            }
        }
        maze[row][col] = 1;
    }
    public static void main(String[] args) {
        int[][] maze = {{1,0,0,0},
                        {1,1,0,1},
                        {1,1,0,1},
                        {0,1,1,1}};

        int n = maze.length;
        StringBuilder currPath = new StringBuilder();
        ArrayList<String> reslist = new ArrayList<>();
        if(maze[0][0] != 0 && maze[n-1][n-1]!=0){
            findPath(0,0,maze,n,reslist, currPath);
        }
        if(reslist.size() == 0){
            System.out.println("Not having any path!!");
        }else{
            for(String path: reslist){
                System.out.println(path + " ");
            }
        }
    }
}
