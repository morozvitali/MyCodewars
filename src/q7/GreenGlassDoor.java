package q7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class GreenGlassDoor {

    boolean stepThroughWith(String s) {
        //You can't bring your code, but you can bring this comment

        Character a = null;
for (Character c : s.toCharArray()) {
    if (c == a) { return true; } else { a = c; }
}
        return false;
    }


    public static void main(String[] args) {
        DoorTest test = new DoorTest();
    }
}

class DoorTest {
    @Test
    public void testDoor() {
        GreenGlassDoor door = new GreenGlassDoor();
        String s = "You can write a comment, but not code";
        //Don't listen to the String, you can code!
        assertEquals(s,true,door.stepThroughWith("comment"));
    }
}