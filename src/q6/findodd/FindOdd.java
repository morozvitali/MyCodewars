package q6.findodd;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow();
    }

    public int findOdd(int[] arr) {
        int result = 0;
        for (int num : arr) {
            System.out.println("Було: " + result + " ⊕ " + num + " = " + (result ^ num));
            result ^= num;
        }
        return result;
    }
/*
🔍 Логіка по кроках:
Крок    	num	        result (до)     	Операція	        result (після)	        Коментар
1	        1	        0	                0 ^ 1 = 1	        1	                    1 у скрині
2	        2	        1	                1 ^ 2 = 3	        3	                    новий колір
3	        3	        3	                3 ^ 3 = 0	        0                   	3 нейтралізувався
4	        2	        0	                0 ^ 2 = 2       	2	                    2 у скрині
5	        3	        2	                2 ^ 3 = 1	        1	                    3 додався
6	        1	        1	                1 ^ 1 = 0	        0	                    1 нейтралізувався
7	        4 	        0	                0 ^ 4 = 4	        4                   	лишився тільки 4
 */

    public void debugXor(int[] arr) {
        int result = 0;
        System.out.println("🧠 Початкове значення result = " + result);
        System.out.println("──────────────────────────────────────────");

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int before = result;
            result ^= num;
            System.out.printf("Крок %d: %d ⊕ %d = %d%n", i + 1, before, num, result);
        }

        System.out.println("──────────────────────────────────────────");
        System.out.println("🎯 Підсумковий result = " + result);
    }

    public static void main(String[] args) {
        FindOdd findOdd = new FindOdd();
        int[] arr2 = {4, 5, 4, 5, 4, 7, 4, 11, 11};
        findOdd.debugXor(arr2);
    }
}