package star_patterns;

public class Pattern30 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
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
    }
}
