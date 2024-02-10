package org.csystem.app;

import com.karandev.io.util.console.Console;

class Application {
    public static void run(String[] args)
    {
        int x = 10;
        var a = 10;
        var b = 5.6;
        var c = a++;

        Console.writeLine("a = %d, b = %f, c = %d, x = %d", a, b, c, x);
    }
}
