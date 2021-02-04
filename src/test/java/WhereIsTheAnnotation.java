import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Test;

public class WhereIsTheAnnotation
{
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE_USE, ElementType.PARAMETER})
    @interface Lel
    {
    }

    public static void a(@Lel String args) {}
    public static void b(@Lel String[] args) {}

    @Test
    public void whereIsTheAnnotation() throws Exception
    {
        final Class<WhereIsTheAnnotation> clazz = WhereIsTheAnnotation.class;

        assertTrue(clazz.getDeclaredMethod("a", String.class)
                        .getAnnotatedParameterTypes()[0].isAnnotationPresent(Lel.class));

        assertFalse(clazz.getDeclaredMethod("b", String[].class)
                         .getAnnotatedParameterTypes()[0].isAnnotationPresent(Lel.class));
    }
}
