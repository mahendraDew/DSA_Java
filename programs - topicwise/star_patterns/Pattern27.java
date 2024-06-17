package star_patterns;

public class Pattern27 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        int count = 1;
        int c = (n*n)+1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j<n-i; j++){
                System.out.print(count++ +" ");
            }
            int j = 0;
            for(j = 0; j<n-i; j++){
                System.out.print(c++ + " ");
            }
            c = c - (j-1)*2 -1;
            System.out.println();
        }
    }
}
