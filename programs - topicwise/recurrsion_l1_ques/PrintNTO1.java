package recurrsion_l1_ques;

class PrintNTo1{
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
    }
}