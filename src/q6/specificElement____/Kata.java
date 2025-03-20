package q6.specificElement____;


import java.util.*;

public class Kata {
    public static int[][] selectSubarray(final int[] arr) {
        int n = arr.length;
        List<int[]> results = new ArrayList<>();
        double minQ = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int subSum = 0;
            int subProduct = 1;

            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                subSum += arr[j];
                subProduct *= arr[j];
            }

            if (subSum == 0) continue;

            double q = Math.abs((double) subProduct / subSum);

            if (q < minQ) {
                minQ = q;
                results.clear();
                results.add(new int[]{i, arr[i]});
            } else if (q == minQ) {
                results.add(new int[]{i, arr[i]});
            }
        }

        return results.toArray(new int[0][2]);
    }
}


