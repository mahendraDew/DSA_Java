
public class MaxRepeatSubString {
    public static void main(String[] args) {
        String sequence =  "ababc", word = "ac";
        System.out.println(maxRepeating(sequence, word));
    }
    public static int maxRepeating(String sequence, String word) {
        int wordLen = word.length();
        int count = 0;
        for(int i = 0; i<sequence.length(); i++){
            if(sequence.contains(word)){
                count++;
                sequence = sequence.substring(wordLen, sequence.length());
                System.out.println("at i" + i+sequence);
            }
        }

        return count;
    }
}
