package star_patterns;

public class Pattern14 {
    public static void main(String[] args) {
        pattern14(5);
    }
    static void pattern14(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0;  j<=i; j++){
                System.out.print(" ");
            }
            for( int j = 0; j<n-i; j++){
                if(i==0){
                    if(j < n-1){
                        System.out.print("**");
                    }else{
                        System.out.print("*");
                    }
                }
                else if( j == 0 || j == n-1-i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
