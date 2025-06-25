package q6.sumofnumbers;

public class Sum   {
    public static int GetSum(int a, int b)
    {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return java.util.stream.IntStream.rangeClosed(min, max).sum();
    }

    public static void main(String[] args) {
        System.out.println(Sum.GetSum(-1,0));
    }
}