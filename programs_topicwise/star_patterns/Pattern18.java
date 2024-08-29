package star_patterns;

public class Pattern18 {
    public static void main(String[] args) {
        pattern18(5);
    }
    static void pattern18(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print("*");
            }
            for(int j = 0; j<i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
