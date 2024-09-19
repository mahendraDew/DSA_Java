package recurrsion_backtracking;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length()-1);
    }
    public static void permute(String str, int l, int r){
        if(l == r){
            System.out.println(str);
        }else{
            for(int i = l; i<=r; i++){
                str = swap(str, l, i);
                permute(str, l+1, r);
                str = swap(str, l, i);
            }
        }
    }
    public static String swap(String str, int i, int j){
        char temp;
        char[] chArr = str.toCharArray();
        temp = chArr[i];
        chArr[i] = chArr[j];
        chArr[j] = temp;
        return String.valueOf(chArr); 
    }
}
