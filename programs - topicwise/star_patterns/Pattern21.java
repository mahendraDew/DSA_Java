package star_patterns;

public class Pattern21 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int idx = 1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(idx++ + " ");
            }
            System.out.println();
        }
    }
}
