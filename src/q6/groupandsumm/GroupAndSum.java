package q6.groupandsumm;

import java.util.*;

public class GroupAndSum {

    public static Map<List<Integer>, List<Integer>> groupAndSum(final int[][] data, final int[] indices) {

        Map<List<Integer>, List<Integer>> result = new HashMap<>();
        for (int[] row : data) {
            List<Integer> key = new ArrayList<>();
            List<Integer> values = new ArrayList<>();

            for (int idx : indices) {
                key.add(row[idx]);
            }

            for (int i = 0; i < row.length; i++) {
                boolean isInGroup = false;
                for (int idx : indices) {
                    if (i == idx) {
                        isInGroup = true;
                        break;
                    }
                }
                if (!isInGroup) {
                    values.add(row[i]);
                }
            }

            if (result.containsKey(key)) {
                List<Integer> current = result.get(key);
                for (int i = 0; i < current.size(); i++) {
                    current.set(i, current.get(i) + values.get(i));
                }
            } else {
                result.put(key, values);
            }
        }

        return result;
    }
}