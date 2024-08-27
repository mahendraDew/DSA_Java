
public class RevSubstring {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
    public static String reversePrefix(String word, char ch) {
        int indx = 0;
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                indx = i;
                break;
            }
        }
        if(indx == 0){
            return word;
        }
        int tempIn = indx;
        System.out.println(indx);
        StringBuilder sb = new StringBuilder();
        while(indx>=0){
            sb.append(word.charAt(indx--));
        }
        System.out.println("Stringbuilder: "+ sb.toString());
        sb.append(word.substring(tempIn+1, word.length()));
        return sb.toString();

    }
}