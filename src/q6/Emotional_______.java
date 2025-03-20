package q6;

import java.util.*;
import java.util.Map;

public class Emotional_______ {
    private static final Map<String, Integer> priority = new HashMap<>();
    static {
        priority.put(":D", 5);
        priority.put(":)", 4);
        priority.put(":|", 3);
        priority.put(":(", 2);
        priority.put("T_T", 1);
    }

    public static String[] sortEmotions(boolean order, String[] emotions) {
        int n = emotions.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((order && priority.get(emotions[j]) < priority.get(emotions[j + 1])) ||
                        (!order && priority.get(emotions[j]) > priority.get(emotions[j + 1]))) {
                    String temp = emotions[j];
                    emotions[j] = emotions[j + 1];
                    emotions[j + 1] = temp;
                }
            }
        }
        return emotions;
    }

    public static String[] sortEmotions2(boolean order, String[] emotions) {
        int n = emotions.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((order && priority.get(emotions[j]) < priority.get(emotions[j + 1])) ||
                        (!order && priority.get(emotions[j]) > priority.get(emotions[j + 1]))) {
                    String temp = emotions[j];
                    emotions[j] = emotions[j + 1];
                    emotions[j + 1] = temp;
                }
            }
        }
        return emotions;
    }
}



