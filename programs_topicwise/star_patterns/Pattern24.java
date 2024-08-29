package star_patterns;

public class Pattern24 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j = 0; j<(n-1-i)*2;j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                if(j == 0 || j == n-1-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 0; j<i*2; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<n-i; j++){
                if(j == 0 || j == n-1-i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
