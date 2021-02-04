import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class IntegersEquality
{
    @Test
    public void twoPrimitives100()
    {
        int i1 = 100;
        int i2 = 100;
        assertTrue(i1 == i2);
    }

    @Test
    public void twoObjects100()
    {
        Integer i1 = 100;
        Integer i2 = 100;
        assertTrue(i1 == i2);
    }

    @Test
    public void twoPrimitives1000()
    {
        int i1 = 1000;
        int i2 = 1000;
        assertTrue(i1 == i2);
    }

    @Test
    public void twoObjects1000()
    {
        Integer i1 = 1000;
        Integer i2 = 1000;
        assertFalse(i1 == i2);
    }
}
