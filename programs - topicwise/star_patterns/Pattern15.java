package star_patterns;

public class Pattern15 {
    public static void main(String[] args) {
        pattern15(5);
    }
    static void pattern15(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<=i+1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<n-1-i; j++){
                if(j == 0 || j == n-2-i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
