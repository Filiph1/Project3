import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseListDemoTest {

    @Test
    void shouldReverseListOfStrings() {
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            input.add("String" + i);
            output.add("String" + (4 - i));
        }
        ArrayList<String> rev = ReverseListDemo.reverseList(input);
        assertEquals(true, rev.equals(output));
    }

    @Test
    void shouldReverseListOfRelatedObjects() {
        ArrayList<Number> input = new ArrayList<>();
        input.add(Integer.valueOf(4));
        input.add(Double.valueOf(3.5));
        input.add(Long.valueOf("21473862899"));
        ArrayList<Number> output = new ArrayList<>();
        output.add(Long.valueOf("21473862899"));
        output.add(Double.valueOf(3.5));
        output.add(Integer.valueOf(4));
        ArrayList<Number> rev = ReverseListDemo.reverseList(input);
        assertEquals(true, rev.equals(output));
    }
}