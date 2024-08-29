package star_patterns;

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern2(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
