package org.csystem.app;

import com.karandev.io.util.console.Console;

import java.util.Random;

class Application {
    public static void run(String[] args)
    {
        Random random = new Random();

        for (var i = 0; i < 10; ++i)
            System.out.println(random.nextInt(100));
    }
}
