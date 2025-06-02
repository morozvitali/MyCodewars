Background
Often times when working with raw tabular data, 
a common goal is to split the data into groups 
and perform an aggregation as a way to simplify 
and draw meaningful conclusions from it. 
The aggregation function can be anything that 
reduces the data (sum,mean,standard deviation,etc.). 
For the purpose of this kata, it will always be the sum function.

Task
Define a function that accepts two arguments, 
the first being a list of list that represents 
the raw data, and the second being a list of column indices.

The return value should be a dictionary with the key being
the groups as a tuple and the values should be a list 
containing the aggregated sums.

Example
arr = [
[1, 6, 2, 10],
[8, 9, 4, 11],
[9, 8, 7, 12],
[1, 6, 3, 20],
]

idx = [0, 1]

group(arr, idx) == {
(1, 6): [5, 30],      # [2 + 3, 10 + 20]
(8, 9): [4, 11],
(9, 8): [7, 12]
}
Explanation
Columns 0 and 1 are used for grouping, so columns 2 and 3 will 
be aggregated
Rows 0 and 3 are grouped together because they have the same 
values in columns idx, so the columns which are not a part of idx are aggregated
Row 1 and 2 have different values in columns idx, so they are not grouped, 
and the aggregated results will simply be their own values in the columns 
which are not a part of idx

Notes
all inputs are valid
arguments will never be empty


import java.util.*;

public class GroupAndSum {

public static Map<List<Integer>, List<Integer>> groupAndSum(final int[][] data, final int[] indices) {
        return new HashMap<>();
    }
}



-------------------------------------------------------------------------------------------
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class GroupAndSumSampleTests {

@Test
    void sampleTests() {
        final int[][] data1 = { {1, 2, 3}, {1, 5, 6}, {1, 8, 9} };
        final int[] indices1 = {0};
        final Map<List<Integer>, List<Integer>> expected1 = Map.of(List.of(1), List.of(15, 18));
        assertEquals(expected1, GroupAndSum.groupAndSum(data1, indices1));
        final int[][] data2 = { {1, 1, 1}, {1, 2, 1}, {1, 3, 1} };
        final int[] indices2 = {0, 2};
        final Map<List<Integer>, List<Integer>> expected2 = Map.of(List.of(1, 1), List.of(6));
        assertEquals(expected2, GroupAndSum.groupAndSum(data2, indices2));
        final int[][] data3 = { {1, 2, 3}, {4, 5, 6}, {6, 7, 8} };
        final int[] indices3 = {0, 1, 2};
        final Map<List<Integer>, List<Integer>> expected3 = Map.of(
            List.of(1, 2, 3), List.of(),
            List.of(4, 5, 6), List.of(),
            List.of(6, 7, 8), List.of()
        );
        assertEquals(expected3, GroupAndSum.groupAndSum(data3, indices3));
    }
}


