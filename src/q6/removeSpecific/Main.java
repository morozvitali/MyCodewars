package q6.removeSpecific;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] arr = new int[]{5, 1, 7, 4, 3};
        int[][] array2 = m.firstPart(arr, arr.length);

        List <Integer> list = m.secondPart(array2, arr.length);
        list.stream().collect(Collectors.toMap(key -> key, key -> arr[key]));
    }

    public int[][] firstPart(int[] array, int n) {
        int[][] newArray = new int[n][];
        for (int i = 0; i < n; i++) {
            List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
            list.remove(i);
            newArray[i] = new int[n - 1];
            for (int a = 0; a < n - 1; a++) {
                newArray[i][a] = list.get(a);
            }
        }
        return newArray;
    }

    public List<Integer> secondPart(int[][] array, int n) {
        List<Double> list = new ArrayList<>();

        for (int[] ints : array) {
            int sum = Arrays.stream(ints).reduce(0, (a, b) -> a + b);
            int mult = Arrays.stream(ints).reduce(1, (a, b) -> a * b);
            list.add((double) mult / sum);
        }

        System.out.println(list.toString());
        Double firstValue = list.stream().reduce(Double.MAX_VALUE, (a, b) -> a < b ? a : b);
            return IntStream.range(0, list.size())
                    .filter(i -> list.get(i) == firstValue)
                    .boxed()
                    .collect(Collectors.toList());
    }
}
