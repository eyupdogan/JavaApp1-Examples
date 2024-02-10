package org.csystem.app;

import com.karandev.io.util.console.Console;

import java.math.BigInteger;
import java.util.Random;

class Application {
    public static void run(String[] args)
    {
        var a = Console.readBigInteger("Input first number:");

        for (var i = BigInteger.ZERO; i.compareTo(BigInteger.TEN) < 0; i = i.add(BigInteger.ONE))
            Console.writeLine("%s ", i);
    }
}
