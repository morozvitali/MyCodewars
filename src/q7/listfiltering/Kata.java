package q7.listfiltering;

import java.util.List;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {

        return list.stream().filter(a-> a instanceof Integer).toList();
    }
}