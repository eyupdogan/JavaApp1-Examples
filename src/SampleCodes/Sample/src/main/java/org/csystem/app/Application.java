package org.csystem.app;

import com.karandev.io.util.console.Console;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Application {
    public static void run(String[] args)
    {
        var now = new GregorianCalendar(1993, Calendar.OCTOBER, 24);

        Console.writeLine("%02d/%02d/%04d", now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.MONTH) + 1, now.get(Calendar.YEAR));
    }
}

