package q6.persist;

public class Persist {
    public static int persistence(long n) {
        long value = n;
        int counter = 0;
        while (true) {

            if (value < 10) {
                return counter;
            } else {
                counter++;
                value = perc(value);
            }
        }
    }

    public static long perc(long number) {
        return String.valueOf(number)
                .chars()
                .mapToObj(Character::getNumericValue)
                .reduce(1, (a, b) -> a * b);
    }
}