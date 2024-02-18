package org.csystem.app;

import org.csystem.util.console.Console;

class Application {
    public static void run(String...args)
    {
        int i;

        for (i = 10; i >= 0; ++i)
            ; //System.out.println(i);

        System.out.printf("i = %d%n", i);
    }
}
