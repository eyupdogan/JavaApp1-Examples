package org.csystem.app;

import org.csystem.util.console.Console;

class Application {
    public static void run(String[] args)
    {
        PrintCollatzTest.run();
    }
}


class PrintCollatzTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Bir sayı giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n == 0)
                break;

            NumberUtil.printCollatz(n);
        }

        System.out.println("Tekrar Yapıyor musunuz?");
    }
}

class NumberUtil {
    public static void printCollatz(int n)
    {
        for (;;) {
            if (n % 2 == 0) {
                n /= 2;
            }else
                n = 3 * n + 1;

            System.out.printf("%d ", n);

            if (n == 1)
                break;
        }
    }
}