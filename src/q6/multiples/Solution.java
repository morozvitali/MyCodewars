package q6.multiples;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int number) {
        Set<Integer>set = new HashSet<>();
        for (int i =0; i<number; i++) {
            if ((i%3 == 0) || (i%5 == 0)) {
                set.add(i);
            }
        }
        return set.stream().reduce((a,b) -> a+b).orElse(0);
    }
}

//     return IntStream.range(0, number)
//                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
//                    .sum();
//  }