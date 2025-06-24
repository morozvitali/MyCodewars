package q8;
public class GrassHoper {
    public static int summation(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n).sum();
    }
}