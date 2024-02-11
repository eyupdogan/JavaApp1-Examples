package org.csystem.app;

import org.csystem.util.console.Console;

class Application {
    public static void run(String[] args)
    {
        Sample.foo(100);
    }
}

class Sample {
    public static void foo(int x)
    {
        Console.writeLine("Giriş %d", x);

        if (x == 0)
            return;

        foo(x - 1);
        Console.writeLine("Çıkış %d", x);
    }
}
