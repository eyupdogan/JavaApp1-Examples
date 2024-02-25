package org.csystem.app;

import com.karandev.io.util.console.annotation.Command;
import com.karandev.io.util.console.annotation.Commands;
import com.karandev.io.util.console.annotation.ErrorCommand;

public class CommandsInfo {

    @Command("upp") //bu metod upp ismi ile çağırılabilecek
    @Command //hiçbir value vermezsek metod ismi ile de çağırılabilecek
    private void upper(String str)
    {

    }

    @Command("low") //bu metod low ismi ile çağırılabilecek
    @Command //hiçbir value vermezsek metod ismi ile de çağırılabilecek
    private void lower(String str)
    {

    }

    @Commands({@Command("quit"), @Command("leave"), @Command})
    private void exit(String str)
    {

    }

    @ErrorCommand
    private void error()
    {

    }
}
