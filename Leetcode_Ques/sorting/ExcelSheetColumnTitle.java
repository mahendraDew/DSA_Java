package Leetcode_Ques.sorting;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 28;
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char ch = (char)( 'A' + columnNumber % 26);
            sb.insert(0, ch);
            columnNumber /= 26;
        }

        return sb.toString();
    }
}
