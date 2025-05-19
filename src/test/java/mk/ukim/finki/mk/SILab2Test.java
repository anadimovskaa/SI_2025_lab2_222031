package mk.ukim.finki.mk;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {

    @Test
    public void testValidInput() {
        Item item1 = new Item("Apple", 2, 100, 0);
        Item item2 = new Item("TV", 1, 400, 0.1);
        List<Item> items = List.of(item1, item2);
        double expected = 2 * 100 + 1 * 400 * 0.9 - 30;
        assertEquals(expected, SILab2.checkCart(items, "1234567890123456"), 0.01);
    }

    @Test
    public void testInvalidInput() {
        Item item = new Item("Banana", 1, 50, 0);
        List<Item> items = List.of(item);
        try {
            SILab2.checkCart(items, "123");
            fail("Expected RuntimeException for invalid card number");
        } catch (RuntimeException e) {
            assertEquals("Invalid card number!", e.getMessage());
        }


        Item item2 = new Item(null, 1, 50, 0);
        List<Item> items2 = List.of(item2);
        try {
            SILab2.checkCart(items2, "1234567890123456");
            fail("Expected RuntimeException for invalid item");
        } catch (RuntimeException e) {
            assertEquals("Invalid item!", e.getMessage());
        }
    }
}
