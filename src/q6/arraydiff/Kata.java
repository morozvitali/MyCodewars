package q6.arraydiff;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        Set<Integer> toRemove = Arrays.stream(b).boxed().collect(Collectors.toSet());
        return Arrays.stream(a)
                .filter(x -> !toRemove.contains(x))
                .toArray();
    }
}