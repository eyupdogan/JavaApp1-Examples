package org.csystem.app;

import com.karandev.io.util.console.Console;
import org.csystem.util.bitwise.BitwiseUtil;

class Application {
    public static void run(String[] args)
    {
        while (true) {
            var a = Console.readInt("Input first number:");
            var b = Console.readInt("Input second number:");

            Console.writeLine(BitwiseUtil.toBinaryStr(a));
            Console.writeLine(BitwiseUtil.toBinaryStr(b));
            Console.writeLine(BitwiseUtil.toBinaryStr(a ^ b));
        }
    }
}