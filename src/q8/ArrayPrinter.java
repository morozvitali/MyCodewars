package q8;

import java.util.Arrays;

public class ArrayPrinter {
    public static String printArray(Object[] array) {
        return Arrays.stream(array).reduce((a,b) -> a + ","+ b).orElse("").toString();
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] { 2, 4, 5, 2 };
        System.out.println(ArrayPrinter.printArray(array));
    }
}


/*
Input: Array of elements
["h","o","l","a"]
Output: String with comma delimited elements of the array in th same order.
        "h,o,l,a"
Note: if this seems too simple for you try the next level
Note2: the input data can be: boolean array, array of objects, array of string arrays, array of number arrays... 😕
 */