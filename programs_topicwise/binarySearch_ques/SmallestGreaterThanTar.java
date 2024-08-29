package binarySearch_ques;

public class SmallestGreaterThanTar {
    public static void main(String[] args) {
        char[] letters = {'a', 'c','m','p','x'};
        char target = 'a';
        char ch = nextGreatestLetter(letters, target);
        System.out.println("target:"+target);
        System.out.println(ch);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(letters[mid] <= target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return letters[start % letters.length];
    }
}
