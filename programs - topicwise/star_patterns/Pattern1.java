package star_patterns;

public class Pattern1 {
    public static void main(String[] args) {
        box(5);
    }
    static void box(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
