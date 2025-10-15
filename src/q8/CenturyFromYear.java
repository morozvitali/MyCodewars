package q8;

public class CenturyFromYear {
    public static int century(int number) {
        if (number % 100 == 0) {
            return number/100;
        }
        return number/100 + 1;
    }
}