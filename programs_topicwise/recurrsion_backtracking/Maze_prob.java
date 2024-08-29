package recurrsion_backtracking;

import java.util.ArrayList;

public class Maze_prob {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        System.out.println(pathCount(r, c));
        path("", r, c);
        System.out.println(pathRet("", r, c));
        
        System.out.println("Paht with Diagonal:");
        System.out.println(pathDia("", r, c));
    }
    //path counter
    private static int pathCount(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = pathCount(r-1, c);
        int right = pathCount(r, c-1);
        return left + right;
    }

    //printing the path
    private static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D', r-1, c);
        }
        if(c>1){
            path(p+'R', r, c-1);
        }
    }

    //return as an arraylist
    private static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRet(p+'D', r-1, c));
        }if(c>1){
            list.addAll(pathRet(p+'R', r, c-1));
        }

        return list;
    }

    //including diagonal H-horizontal, V-vertical, D-diagonal
    private static ArrayList<String> pathDia(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r >1 && c>1){
            list.addAll(pathDia(p+'D', r-1, c-1));
        }
        if(r>1){
            list.addAll(pathDia(p+'V', r-1, c));
        }
        if(c>1){
            list.addAll(pathDia(p+'H', r, c-1));
        }

        return list;
    }
}
