import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest {

    @Test
    public void testIfCheckoutMethodExists() {
        Checkout1  checkout = new Checkout1();
    }
    
    @Test
    public void testIfCheckoutMethodReturnsCorrectArrayList() {
        Checkout1  checkout = new Checkout1();
        String name = "divine";
        ArrayList<String> product = new ArrayList<>();
        product.add("testing");
        ArrayList<Integer> itemsNumber = new ArrayList<>();
        ArrayList<Double> itemPrice = new ArrayList<>();
        ArrayList<String> actual = checkout.displayQuestions(name, product, itemsNumber, itemPrice);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("testing");
        assertEquals(expected, actual);
        
    }
}


