class Solution {
    public int findMinDifference(List<String> timePoints) {
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