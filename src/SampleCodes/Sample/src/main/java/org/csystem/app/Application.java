
package org.csystem.app;


import com.karandev.io.util.console.CommandPrompt;

class Application {
    public static void run(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Bir sayı giriniz:");
            int a = Integer.parseInt(kb.nextLine());
            long b;

            b = a;

            System.out.printf("a = %d%n", a);
            System.out.printf("a = %08X%n",a);
            System.out.printf("b = %d%n", b);
            System.out.printf("b = %016X%n", b);

            if (a == 0)
                break;
        }
    }
}

