package q6.removeSpecific;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {

    public static int[][] selectSubarray(final int[] arr) {
                // your code here
                int n = arr.length;

                int[][] bigArray = new int[n][];
                for (int i = 0; i < n; i++) {
                    List<Integer> tempList = Arrays.stream(arr).boxed().collect(Collectors.toList());
                    tempList.remove(i);
                    bigArray[i] = new int[n - 1];
                    for (int a = 0; a < n - 1; a++) {
                        bigArray[i][a] = tempList.get(a);
                    }
                }

                List<Double> listQ = new ArrayList<>();

                for (int[] subArray : bigArray) {
                    int sum = Arrays.stream(subArray).sum();
                    double product = 1.0;

                    for (int value : subArray) {
                        product *= value;
                    }

                    if (sum == 0) {
                        listQ.add(Double.POSITIVE_INFINITY);
                    } else {
                        listQ.add(Math.abs(product / sum));
                    }
                }

                double min = listQ.stream().min(Double::compareTo).orElse(Double.POSITIVE_INFINITY);

                final double EPSILON = 1e-9;
                List<Integer> indexes = new ArrayList<>();
                for (int i = 0; i < listQ.size(); i++) {
                    if (Math.abs(listQ.get(i) - min) < EPSILON) {
                        indexes.add(i);
                    }
                }

                int[][] result = new int[indexes.size()][2];
                for (int i = 0; i < indexes.size(); i++) {
                    int idx = indexes.get(i);
                    result[i][0] = idx;
                    result[i][1] = arr[idx];
                }

                return result;
            }
        }