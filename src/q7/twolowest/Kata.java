package q7.twolowest;

class Kata{
    public static long sumTwoSmallestNumbers(long[] numbers) {
        return java.util.Arrays.stream(numbers).sorted().limit(2).sum();


    }
}