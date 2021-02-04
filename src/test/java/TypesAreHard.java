import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypesAreHard
{
    @Test
    public void finalLocalVariable()
    {
        assertEquals("a", out ->
        {
            final int a = 97;
            out.print(true ? a : 'c');
        });
    }

    @Test
    public void nonFinalLocalVariable()
    {
        assertEquals("97", out ->
        {
            int b = 97;
            out.print(true ? b : 'c');
        });
    }

    // this method provides PrintStream to test, so we don't have to use System.out
    private void assertEquals(final String expected, final Consumer<PrintStream> testBody)
    {
        final ByteArrayOutputStream outBuffer = new ByteArrayOutputStream();
        testBody.accept(new PrintStream(outBuffer));

        Assertions.assertEquals(expected, outBuffer.toString(StandardCharsets.UTF_8));
    }
}
