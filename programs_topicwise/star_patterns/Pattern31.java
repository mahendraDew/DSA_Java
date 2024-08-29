package star_patterns;

public class Pattern31 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int i = 0; i<(n*2)-1; i++){
            for(int j = 0; j<(n*2)-1; j++){
                int ele = Math.min(Math.min(i, j), Math.min((n*2)-i-2, (n*2)-j-2));
                System.out.print(n-ele+" ");
            }
            System.out.println();
        }
    }
}
