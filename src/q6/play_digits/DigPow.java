package q6.play_digits;

public class DigPow {
    public static long digPow(int n, int p) {
       int [] array = String.valueOf(n).chars()
               .map(c->c-'0')
               .toArray();
       long sum = 0;
       for (int i = 0; i<array.length; i++) {
           sum = (long) (sum + Math.pow(array [i], p + i));
       }
        return sum % n == 0 ? (int)(sum / n) : -1;
    }
}
