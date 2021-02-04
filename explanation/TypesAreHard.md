TypesAreHard
============

```
final int a = 97;
System.out.println(true ? a : 'c');
```

> The type of a conditional expression is determined as follows:
> * If the second and third operands have the same type (which may be the null type), then that is the type of the conditional expression.
> * If one of the second and third operands is of primitive type T, and the type of the other is the result of applying boxing conversion (§5.1.7) to T, then the type of the conditional expression is T.
> * If one of the second and third operands is of the null type and the type of the other is a reference type, then the type of the conditional expression is that reference type.
> * Otherwise, if the second and third operands have types that are convertible (§5.1.8) to numeric types, then there are several cases:
>   * If one of the operands is of type byte or Byte and the other is of type short or Short, then the type of the conditional expression is short.
>   * If one of the operands is of type T where T is byte, short, or char, and the other operand is a constant expression (§15.28) of type int whose value is representable in type T, then the type of the conditional expression is T.
>   * If one of the operands is of type T, where T is Byte, Short, or Character, and the other operand is a constant expression (§15.28) of type int whose value is representable in the type U which is the result of applying unboxing conversion to T, then the type of the conditional expression is U.
>   * Otherwise, binary numeric promotion (§5.6.2) is applied to the operand types, and the type of the conditional expression is the promoted type of the second and third operands.  
>     _Note that binary numeric promotion performs value set conversion (§5.1.13) and may perform unboxing conversion (§5.1.8)._

_The Java&trade; Language Specification, Java SE 7 Edition_

A third operand is a `char`, and a second operand is "constant expression of type `int`", so the whole expression is evaluated into `char`.

***

```
int b = 97;
System.out.println(true ? b : 'c');
```

> When an operator applies binary numeric promotion to a pair of operands, each of which must denote a value that is convertible to a numeric type, the following rules apply, in order:
> * If any operand is of a reference type, it is subjected to unboxing conversion (§5.1.8).
> * Widening primitive conversion (§5.1.2) is applied to convert either or both operands as specified by the following rules:
>   * If either operand is of type double, the other is converted to double.
>   * Otherwise, if either operand is of type float, the other is converted to float.
>   * Otherwise, if either operand is of type long, the other is converted to long.
>   * Otherwise, both operands are converted to type int.

_The Java&trade; Language Specification, Java SE 7 Edition_

"Binary numeric promotion" is performed, and the whole expression evaluates into `int`