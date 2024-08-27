

public class SwapAdjacentLRString {
    public static void main(String[] args) {
        String start = "XXXXXLXXXX" , end= "LXXXXXXXXX";
        System.out.println(canTransform(start, end));
    }
    public static boolean canTransform(String start, String end) {
      
        char[] sarr = start.toCharArray();
        char[] earr = end.toCharArray();
        for(int j = 0; j<earr.length-1; j++){

            for(int i = 0; i<sarr.length-1; i++){
                // if(sarr[i] == earr[j]){
                //     i++; 
                //     j++;
                // }
                if((i<sarr.length && sarr[i] == 'R' && sarr[i+1] == 'X') && (i<earr.length && earr[i] == 'X' && earr[i+1]=='R')){
                    sarr[i] = 'X';
                    sarr[i+1] = 'R';
                    i++;
                }
                else if((i<sarr.length && sarr[i] == 'X' && sarr[i+1] == 'L') && (i<earr.length && earr[i] == 'L' && earr[i+1]=='X')){
                    sarr[i] = 'L';
                    sarr[i+1] = 'X';
                    i++;
                }
            }
        }
     
        // System.out.println(Arrays.toString(sarr));
        // System.out.println(Arrays.toString(earr));

        for(int i = 0; i<sarr.length; i++){
            if(sarr[i] != earr[i]){
                return false;
            }
        }

        return true;
    }
}
