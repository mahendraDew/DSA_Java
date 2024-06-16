package star_patterns;

public class Pattern16 {
    public static void main(String[] args) {
        pattern16(5);
    }
    static void pattern16(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                int row = findfact(i);
                int col = findfact(j);
                int deno = findfact(i-j);
                int ans = row/(col*deno);
                System.out.print(ans+" ");
            }
            System.out.println();
        }
        
       
    }
    public static int findfact(int n){
        if (n == 0){
            return 1;
        }
        return n * findfact(n - 1);
    }
}
