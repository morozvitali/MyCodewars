package q7.hiandlow;

import java.util.Arrays;

public class Kata {
    public static String highAndLow(String numbers) {
        int max = Arrays.stream(numbers.split(" ")).mapToInt(Integer::valueOf).reduce(Integer.MIN_VALUE, Math::max);
        int min = Arrays.stream(numbers.split(" ")).mapToInt(Integer::valueOf).reduce(Integer.MAX_VALUE, Math::min);
        return max + min + "";
    }
}