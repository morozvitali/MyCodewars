package q6.findodd;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow();
    }
}

/*
public int findOdd(int[] arr) {
    int result = 0;
    for (int num : arr) {
        result ^= num; // ← оце і є магія XOR
    }
    return result;
}
 */