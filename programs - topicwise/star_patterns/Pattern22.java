package star_patterns;

public class Pattern22 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int flag = 1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                if(i%2 != 0 ){
                    if(j%2 == 0){
                        flag = 0;
                    }else{
                        flag = 1;
                    }
                }else{
                    if(j%2 != 0){
                        flag = 0;
                    }else {
                        flag = 1;
                    }
                }
                System.out.print(flag);
            }
            System.out.println();
        }
    }
}
