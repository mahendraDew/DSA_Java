
public class ShiftingLetters {
    public static void main(String[] args) {
        String  s = "abc";
        int[] shifts = {3,5,9};
        System.out.println(shiftingLetters(s, shifts));
    }
    public static String shiftingLetters(String s, int[] shifts) {
        int length = shifts.length;
        char[] result = s.toCharArray();
        long sumValue = 0;

        for (int i = length - 1; i > - 1; i--) {
            sumValue += shifts[i];
           result[i] = (char)((((result[i] - 'a') + sumValue ) % 26) + 'a');
        }

        return String.valueOf(result);    
    }
}