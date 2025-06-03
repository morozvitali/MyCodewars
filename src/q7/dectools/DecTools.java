package q7.dectools;


public class DecTools {
    public static int Digits(long n) {
    return (int)String.valueOf(n).chars().count();
    // return Long.toString(n).length();
    }
}