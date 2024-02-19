package org.csystem.app;


import org.csystem.util.console.Console;

import java.util.Random;

class Application {
    public static void run(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Bir yazı giriniz:");
            String s = kb.nextLine();

            if ("elma".equals(s))
                break;

            if (s.length() != 0)
                System.out.printf("Girilen yazı:(%s)%n", s);
            else
                System.out.println("Boş string girdiniz!...");
        }
    }
}

