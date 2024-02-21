package org.csystem.app;


import com.karandev.io.util.console.Console;
import org.csystem.util.numeric.NumberUtil;

import java.io.InputStream;
import java.util.Random;
import java.util.stream.IntStream;

class Application {
    public static void run(String[] args)
    {
        Object o = 10; //auto boxing: Integer.valueOf(10);

        System.out.println(o.getClass().getName());

        long a = (long)o; //auto unboxing: ((Long)o).longValue();

        System.out.printf("a = %d%n", a);
    }
}
