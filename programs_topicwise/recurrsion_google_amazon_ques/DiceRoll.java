package recurrsion_google_amazon_ques;

import java.util.ArrayList;

public class DiceRoll {
    public static void main(String[] args) {
        int target = 4;
        diceroll("", target);
        System.out.println(dicerollRet("", target));
    }
    private static void diceroll(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<=6 && i<=target; i++){
            diceroll(p+i, target-i);
        }
    }

    //return as an Arraylist
    private static ArrayList<String> dicerollRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i<=6 && i<=target; i++){
            list.addAll(dicerollRet(p+i, target-i));
        }

        return list;
    }

    
}
