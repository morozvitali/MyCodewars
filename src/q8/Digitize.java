package q8;

import java.util.stream.Stream;

public class Digitize {
    public static int[] digitize(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .toString()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
