package star_patterns;

public class Pattern33 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int count = 0;
        char chL = 'a';
        char chU = 'A';
        for(int i = 0; i<n; i++){
            for(int j =0; j<=i; j++){
                if(count%2==0){
                    System.out.print((char)(chL+count++));
                }else{
                    System.out.print((char)(chU+count++));
                    
                }
            }
            System.out.println();
        }
    }
}
