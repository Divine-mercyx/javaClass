import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhonebookAppTest {

    @Test
    public void testThatDisplayOptionsExists() {
        PhonebookApp person = new PhonebookApp();
    }
    
    
    @Test
    public void testThatDisplayOptionsReturnsCorrectValue() {
       PhonebookApp person = new PhonebookApp();
       String actual = person.displayOptions();
       String expected = """
        1. Add Contact
        2. Remove Contact
        3. Find contact by phone number
        4. Find contact by first name
        5. Find contact by last name
        6. Edit contact
        """;
        assertEquals(actual, expected);
    }
}
