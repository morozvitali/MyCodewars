package q8;
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return java.util.Arrays.stream(args).min().orElseThrow();
    }
}