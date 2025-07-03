package q6.narcistic_number;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        String s = String.valueOf(number);
        return number == s.chars().map(с -> (int) Math.pow(с - '0', s.length())).sum();
    }
}
