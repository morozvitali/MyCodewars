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