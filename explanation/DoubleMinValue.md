```
System.out.println(Double.MIN_VALUE > 0); // true
```

According to the Javadoc, `Double.MIN_VALUE` is the smallest positive number possible to encode in a Double,
not the smallest negative number.

> A constant holding the smallest positive nonzero value of type double, 2<sup>-1074</sup>.
> It is equal to the hexadecimal floating-point literal 0x0.0000000000001P-1022 and also equal to Double.longBitsToDouble(0x1L).