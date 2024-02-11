package org.csystem.app;

import com.karandev.io.util.console.Console;

class Application {
    public static void run(String[] args)
    {
        while (true) {
            var a = Console.readInt("Input a number:");

            Console.writeLine("a = %d", a);
            Console.writeLine("a = 0b%s", Integer.toBinaryString(a));
            //Console.writeLine("a = 0x%s", Integer.toHexString(a));
            //Console.writeLine("a = 0%s", Integer.toOctalString(a));

            //1110_0100
            //0001_1011
            //0001_1100

            //AEB1H 1010 1110 1011 0001
            //2D3EH 0010 1101 0011 1110

            //81AC   1000 0001 1010 1100

            if (a == 0)
                break;
        }
    }
}