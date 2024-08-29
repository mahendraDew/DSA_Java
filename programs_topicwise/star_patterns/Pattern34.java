package star_patterns;

public class Pattern34 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print((char)('A'+n-i-1-j));
            }
            System.out.println();
        }
    }
}
