package q6.outlier;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOutlier {
    static int find(int[] integers) {
        Map<Boolean, List<Integer>> map = Arrays
                .stream(integers)
                .boxed()
                .collect(Collectors.partitioningBy(a -> a % 2 == 0));
        return map.get(true).size() == 1
                ? map.get(true).get(0)
                : map.get(false).get(0);
    }
}

/*
You are given an array (which will have a length of at least 3,
but could be very large) containing integers. The array is either
entirely comprised of odd integers or entirely comprised of even
integers except for a single integer N. Write a method that takes
the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)
[160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)
 */