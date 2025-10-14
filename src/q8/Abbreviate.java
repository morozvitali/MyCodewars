package q8;

import java.util.Arrays;
import java.util.List;

public class Abbreviate {
    public static String abbrevName(String name) {
        List<String> list = Arrays.stream(name.split(" "))
                .map(w->w.trim().substring(0,1).toUpperCase())
                .toList();
        return String.join(".", list);
    }
}