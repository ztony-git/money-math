package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        float floatSum = 0f;
        double doubleSum = 0d;
        BigDecimal bigDecimalSum = BigDecimal.ZERO;

        for (int i = 1; i <= 10; i++) {
            floatSum+=.10f;
            doubleSum+=.10d;
            bigDecimalSum = bigDecimalSum.add(new BigDecimal("0.10"));
            System.out.println("Iteration: " + i);
            System.out.println("Float Sum: " + floatSum);
            System.out.println("Double Sum: " + doubleSum);
            System.out.println("Big Decimal Sum: " + bigDecimalSum);
            System.out.println("-----");
        }

        floatSum = 0f;
        doubleSum = 0d;
        bigDecimalSum = BigDecimal.ZERO;

        for (int i = 1; i <= 1000; i++) {
            floatSum+=19.99f;
            doubleSum+=19.99d;
            bigDecimalSum = bigDecimalSum.add(new BigDecimal("19.99"));
        }

        System.out.println("Float Sum: " + floatSum);
        System.out.println("Double Sum: " + doubleSum);
        System.out.println("Big Decimal Sum: " + bigDecimalSum);

        bigDecimalSum = new BigDecimal("1");
        System.out.println(bigDecimalSum);
        bigDecimalSum = bigDecimalSum.add(new BigDecimal("0.100000"));
        System.out.println(bigDecimalSum);

        bigDecimalSum = BigDecimal.ZERO;
        bigDecimalSum.add(new BigDecimal("100.0"));
        System.out.println(bigDecimalSum);

        /* Questions:
        How many cents is the float off after 1000 passes?
            Float is off by 18.4 cents after 1000 passes of adding 19.99.

        Why does the BigDecimal print 1.00 and not 1?
            Because I was using the .add() function with a number that has a scale of two (.10). If I were to add with
            the same number but with a scale of three, it'd be 1.000 (.100).

        What happens if you call add() without assigning the result back?
            Everytime you call the .add() function from BigDecimal, it returns a new BigDecimal object, leaving the initial
            object untouched. Thus, you have to assign the result back to the original BigDecimal object to update the initial
            object.

         */
    }
}
