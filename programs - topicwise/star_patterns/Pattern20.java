package star_patterns;

public class Pattern20 {
    public static void main(String[] args) {
        pattern20(5);
    }
    static void pattern20(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i == 0 || i == n-1){
                    System.out.print("*");
                }
                else if(j == 0 || j == n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
