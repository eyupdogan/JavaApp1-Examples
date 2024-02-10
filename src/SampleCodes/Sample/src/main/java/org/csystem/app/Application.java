package org.csystem.app;

import com.karandev.io.util.console.Console;

import java.math.BigInteger;

class Application {
    public static void run(String[] args)
    {
        while (true) {
            var a = new BigInteger(Console.read("Birinci sayıyı giriniz:"));
            var b = new BigInteger(Console.read("İkinci sayıyı giriniz:"));
            var c = new BigInteger(Console.read("Üçüncü sayıyı giriniz:"));
            var d = a.add(b);

            if (c.equals(d))
                break;

            Console.writeLine("a = %s", a);
            Console.writeLine("b = %s", b);
            Console.writeLine("c = %s", c);
            Console.writeLine("d = %s", d);

        }
    }
}
