package q7;



import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

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

class SolutionTest {
    @Test
    public void basic1() {
        assertEquals("kill me now", TheOffice.boredom(new Person[] {
                new Person("tim", "change"),
                new Person("jim", "accounts"),
                new Person("randy", "canteen"),
                new Person("sandy", "change"),
                new Person("andy", "change"),
                new Person("katie", "IS"),
                new Person("laura", "change"),
                new Person("saajid", "IS"),
                new Person("alex", "trading"),
                new Person("john", "accounts"),
                new Person("mr", "finance")
        }));
    }

    @Test
    public void basic2() {
        assertEquals("i can handle this", TheOffice.boredom(new Person[] {
                new Person("tim", "IS"),
                new Person("jim", "finance"),
                new Person("randy", "pissing about"),
                new Person("sandy", "cleaning"),
                new Person("andy", "cleaning"),
                new Person("katie", "cleaning"),
                new Person("laura", "pissing about"),
                new Person("saajid", "regulation"),
                new Person("alex", "regulation"),
                new Person("john", "accounts"),
                new Person("mr", "canteen")
        }));
    }

    @Test
    public void basic3() {
        assertEquals("party time!!", TheOffice.boredom(new Person[] {
                new Person("tim", "accounts"),
                new Person("jim", "accounts"),
                new Person("randy", "pissing about"),
                new Person("sandy", "finance"),
                new Person("andy", "change"),
                new Person("katie", "IS"),
                new Person("laura", "IS"),
                new Person("saajid", "canteen"),
                new Person("alex", "pissing about"),
                new Person("john", "retail"),
                new Person("mr", "pissing about")
        }));
    }
}