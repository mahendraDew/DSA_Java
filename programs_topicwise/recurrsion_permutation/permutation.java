package recurrsion_permutation;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutationFun("", str);
        System.out.println(permutationFun2("", str));
        System.out.println(permutationFun3("", str));
    }
    private static void permutationFun(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i<=p.length(); i++){
            String left = p.substring(0, i);
            String right = p.substring(i, p.length());
            permutationFun(left+ch+right, up.substring(1));
        }
    }
    // retrun as arrylist
    private static ArrayList<String> permutationFun2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationFun2(f+ch+s, up.substring(1)));
        }
        return ans;
    }

    //count the number of permutation
    private static int permutationFun3(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for(int i = 0; i<=p.length(); i++){
            String  f= p.substring(0, i);
            String s = p.substring(i,p.length());
            count += permutationFun3(f+ch+s, up.substring(1));
        }
        return count;

    }
}
