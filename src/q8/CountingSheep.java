package q8;
public class CountingSheep {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) java.util.Arrays.stream(arrayOfSheeps).filter(a->a != null).filter(a -> a == true).count();
    }
}