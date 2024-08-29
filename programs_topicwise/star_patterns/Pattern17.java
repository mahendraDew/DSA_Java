package star_patterns;

public class Pattern17 {
    public static void main(String[] args) {
        pattern17(5);
    }
    static void pattern17(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j>=0; j--){
                System.out.print(j+1);
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<=i+1; j++){
                System.out.print(" ");
            }
            for(int j = n-1-i; j>0; j--){
                System.out.print(j);
            }
            for(int j = 2; j<=n-1-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
