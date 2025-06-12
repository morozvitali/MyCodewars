package q6.digitalroot;

import java.util.Arrays;
import java.util.List;

public class DRoot {
    public static int digital_root(int n) {
        while (n < 10) {
            n = String.valueOf(n)
                    .chars()
                    .map(c -> c - '0')
                    .sum();
        }
        return n;
    }
}