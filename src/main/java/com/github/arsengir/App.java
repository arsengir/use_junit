package com.github.arsengir;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
//        ошибка в том что происходит деление на 0
//        одно из решений при делении проверять что если делим на 0, то возвращать бесконечность(INFINITY)
        double c = calc.divide.apply((double)a, (double)b);

        calc.println.accept(c);

        int d = calc.multiply.apply(a, b);
        int p = calc.pow.apply(a);
        int r = calc.abs.apply(-10);

        calc.println.accept(d);
        calc.println.accept(p);
        calc.println.accept(r);
        System.out.println(calc.isPositive.test(-10));
    }
}
