import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FinallyExitMethod
{

    @Test
    public void test()
    {
        assertTrue(finallyExitMethod() == 2);
    }

    private static int finallyExitMethod()
    {
        try
        {
            throw new Exception();
        }
        catch (final Exception exception)
        {
            System.out.println("catch");
            return printAndGetNumber(1);
        }
        finally
        {
            System.out.println("finally");
            return printAndGetNumber(2);
        }
    }

    private static int printAndGetNumber(int number)
    {
        System.out.println("number: " + number);
        return number;
    }

}
