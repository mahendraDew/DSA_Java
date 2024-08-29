package recurrsion_l1_ques;

public class PrintNto1then1ToN {
    public static void main(String[] args) {
        int n = 5;
        printFun(n);
    }
    static void printFun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printFun(n-1);
        System.out.println(n);
    }
}
