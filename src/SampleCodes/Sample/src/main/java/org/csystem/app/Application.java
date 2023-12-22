package org.csystem.app;


import com.karandev.io.util.console.Console;
import org.csystem.util.numeric.NumberUtil;

class Application {
    public static void run(String [] args)
    {
        long start = System.currentTimeMillis();
        long nanoStart = System.nanoTime();
        Console.writeLine(NumberUtil.isPrime(569_785_970_6174_583_067L) ? "Asal" : "Asal değil");
        long end = System.currentTimeMillis();
        long nanoEnd = System.nanoTime();

        Console.writeLine("Duration:%f seconds", (end - start) / 1000.);
        Console.writeLine("Duration:%f seconds (nanoTime)", (nanoEnd - nanoStart) / 1_000_000_000.);
    }
}

