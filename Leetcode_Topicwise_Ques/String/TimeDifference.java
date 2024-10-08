
import java.util.ArrayList;
import java.util.Arrays;

public class TimeDifference {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("23:59");
        list.add("00:00");
        System.out.println(findMinDifference(list));

        // timepoint = ["23:59","00:00"]
        // arr = [[23,59],
        // [00,00],
        // [12,23]];
    }

    public static int findMinDifference(ArrayList<String> timePoints) {
        String s;
        int n = timePoints.size();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            s = timePoints.get(i);
            int p = ((s.charAt(0) - '0') * 10 + (s.charAt(1) - '0')) * 60;
            int q = (s.charAt(3) - '0') * 10 + (s.charAt(4) - '0');
            x[i] = p + q;
        }
        Arrays.sort(x);
        int c = x[n - 1] - x[0];
        if (c > 720)
            c = 1440 - c;
        for (int i = 0; i < n - 1; i++) {
            int b = x[i + 1] - x[i];
            if (b > 720)
                b = 1440 - b;
            if (b < c)
                c = b;
        }
        return c;
    }

}
