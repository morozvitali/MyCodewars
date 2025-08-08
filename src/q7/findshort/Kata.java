package q7.findshort;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .min(Comparator.comparingInt(String::length))
                .orElse("")
                .length();
    }
}