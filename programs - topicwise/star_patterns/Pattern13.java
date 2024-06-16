package star_patterns;

public class Pattern13 {
    public static void main(String[] args) {
        pattern13(5);
    }
    static void pattern13(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                if(i == n-1 && j<n-1){ 
                    System.out.print("**");
                }
                else if(j == 0 || j == i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
