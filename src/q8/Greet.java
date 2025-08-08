package q8;

public class Greet {
    public static String greet () {
        return new StringBuilder("!dlrow olleh").reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(Greet.greet());
    }
}
