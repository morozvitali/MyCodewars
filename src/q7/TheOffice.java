package q7;

import java.util.HashMap;
import java.util.Map;

public class TheOffice {
    private static final Map<String, Integer> departmentScores = new HashMap<>();

    static {
        departmentScores.put("accounts", 1);
        departmentScores.put("finance", 2);
        departmentScores.put("canteen", 10);
        departmentScores.put("regulation", 3);
        departmentScores.put("trading", 6);
        departmentScores.put("change", 6);
        departmentScores.put("IS", 8);
        departmentScores.put("retail", 5);
        departmentScores.put("cleaning", 4);
        departmentScores.put("pissing about", 25);
    }

    public static String boredom(Person[] staff) {
        int sum = 0;
        for (Person p : staff) {
            sum += departmentScores.getOrDefault(p.department, 0);
        }

        return sum <= 80 ? "kill me now"
                : sum < 100 ? "i can handle this"
                : "party time!!";
    }
}

class Person {
    public final String name;
    public final String department;

    public Person(String name, String department) {
        this.name = name;
        this.department = department;
    }
}