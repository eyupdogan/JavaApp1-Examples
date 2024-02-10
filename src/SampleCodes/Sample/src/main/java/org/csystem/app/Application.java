package org.csystem.app;

import com.karandev.io.util.console.Console;
import org.csystem.util.numeric.NumberUtil;

class Application {
    public static void run(String[] args)
    {
        Console.writeLine("%d ", NumberUtil.getPrime(2));
        Console.writeLine("%d ", NumberUtil.getPrimeBigInteger(2));
    }
}
