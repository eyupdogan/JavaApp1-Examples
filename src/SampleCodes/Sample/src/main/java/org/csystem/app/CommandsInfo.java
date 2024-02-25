package org.csystem.app;

import com.karandev.io.util.console.Console;
import com.karandev.io.util.console.annotation.Command;
import com.karandev.io.util.console.annotation.Commands;
import com.karandev.io.util.console.annotation.ErrorCommand;

public class CommandsInfo {

    @Command("upp") //bu metod upp ismi ile çağırılabilecek
    @Command //hiçbir value vermezsek metod ismi ile de çağırılabilecek
    private void upper(String str)
    {
        Console.writeLine(str.toUpperCase());
    }

    @Command("low") //bu metod low ismi ile çağırılabilecek
    @Command //hiçbir value vermezsek metod ismi ile de çağırılabilecek
    private void lower(String str)
    {
        Console.writeLine(str.toLowerCase());
    }

    @Command
    private void any(String s1)
    {
        Console.writeLine(s1);
    }

    @Command
    private void any(String s1, String s2)
    {
        Console.writeLine("%s, %s", s1, s2);
    }

    @Commands({@Command("quit"), @Command("leave"), @Command})
    private void exit()
    {
        Console.writeLine("Thanks");
        System.exit(1);
    }

    @ErrorCommand
    private void error()
    {
        Console.Error.writeLine("Command not found");
    }
}
