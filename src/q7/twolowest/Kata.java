package q7.twolowest;

import java.util.Arrays;
import java.util.stream.Collectors;

class Kata{
    public static long sumTwoSmallestNumbers(long[] numbers) {
        return java.util.Arrays.stream(numbers).sorted().limit(2).sum();
    }
}