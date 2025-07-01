package q6.findunique;

import java.util.Arrays;

public class Kata {

    public static double findUniq(double arr[]) {
        double epsilon = 0.000001;

        // Крок 1: знайти повторюване значення (common)
        double common = Math.abs(arr[0] - arr[1]) < epsilon ? arr[0]
                : Math.abs(arr[0] - arr[2]) < epsilon ? arr[0]
                : arr[1];

        // Крок 2: розділити через partitioningBy
        return Arrays.stream(arr)
                .filter(d -> Math.abs(d - common) > epsilon)
                .findFirst()
                .orElseThrow();
    }
}


/*
    public static double findUniq(double[] arr) {
      Arrays.sort(arr);
      return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}

 */
/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!
Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.
The tests contain some very huge arrays, so think about performance.
 */