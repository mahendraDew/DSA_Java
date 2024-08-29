package star_patterns;

public class Pattern23 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                if(j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 0; j<i; j++){
                if(j==i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 0; j<n-1-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<n-1-i; j++){
                if(j==n-i-2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 0; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i-1; j++){
                if(j == i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 0; j<n-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
