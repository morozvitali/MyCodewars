package q8;

import java.util.Arrays;

public class SquareSum {
    public static int squareSum(int[] n)
    {
        return Arrays.stream(n).map(m->m*m).reduce(0, (a,b)-> a + b);
        //.sum();
    }
}

/*
Complete the square sum function so that it squares each number passed into it and then sums the results together.
For example, for [1, 2, 2] it should return 9
 */
