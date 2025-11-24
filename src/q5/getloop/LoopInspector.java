package q5.getloop;

import org.w3c.dom.Node;

import java.util.*;

public class LoopInspector {

    public int loopSize(Node node) {
        Set <Node> visited = new HashSet<>();
        Node current = node;

        while (!visited.contains(current)) {
            visited.add(current);
            current = current.getNextSibling();
        }

        Node cycleStart = current;
        int count = 1;
        current = current.getNextSibling();

        while (current != cycleStart) {
            count++;
            current = current.getNextSibling();
        }
        return count;
    }
}