package org.csystem.app;


import com.karandev.io.util.console.Console;
import org.csystem.util.numeric.NumberUtil;

import java.io.InputStream;
import java.util.Random;
import java.util.stream.IntStream;

class Application {
    public static void run(String[] args)
    {
        var count = Console.readInt("Bir sayı giriniz");
        var random = new Random();

        IntStream.generate(()-> random.nextInt(100)).filter(NumberUtil::isPrime).limit(count).forEach(p -> Console.write("%d ", p));
    }
}
