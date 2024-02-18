package org.csystem.app;

import org.csystem.util.console.Console;

class Application {
    public static void run(String...args)
    {
        CountDigitsTest.run();
    }
}

class CountDigitsTest {

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Sayıları girmeye başlayınız:");

        int val;

        while ((val = kb.nextInt()) != 0)
            System.out.printf("%d sayısının basamak sayısı:%d%n", val, NumberUtil.countDigits(val));

        System.out.printf("0 sayısının basamak sayısı:%d%n", NumberUtil.countDigits(0));
    }
}

class NumberUtil {
    public static int countDigits(int val)
    {
        return (int) Math.log10(val) + 1;
    }
}
