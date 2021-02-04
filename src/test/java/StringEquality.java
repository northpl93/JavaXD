import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class StringEquality
{
    @Test
    public void stringEquality()
    {
        final String s1 = "test";
        final String s2 = new String("test");

        assertTrue(s1 == "test");
        assertFalse(s2 == "test");
    }
}
