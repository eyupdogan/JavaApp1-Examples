package org.csystem.app.commandprompt;

import com.karandev.io.util.console.Console;

import java.util.ArrayList;

public class CommandPrompt {
    private String m_cmdstr;

    public ArrayList<CommandInfo> COMMANDS = new ArrayList<>();

    public void fillCommandList(CommandPrompt commandPrompt)
    {
        COMMANDS.add(new CommandInfo("length", CommandPrompt::lengthCallback));
        COMMANDS.add(new CommandInfo("reverse", CommandPrompt::reverseCallback));
        COMMANDS.add(new CommandInfo("lower", CommandPrompt::lowerCallback));
        COMMANDS.add(new CommandInfo("upper", CommandPrompt::upperCallback));
        COMMANDS.add(new CommandInfo("chpr", commandPrompt::chprCallback));
        COMMANDS.add(new CommandInfo("quit", CommandPrompt::quitCallback));
    }

    public CommandPrompt(String cmdstr) {
        m_cmdstr = cmdstr;
    }

    private static void lengthCallback(String[] cmdInfo)
    {
        if (cmdInfo.length <= 2)
            Console.writeLine(cmdInfo[1].length());
        else
            Console.writeLine("Invalid arguments for length command");
    }

    private static void reverseCallback(String [] cmdInfo)
    {
        if (cmdInfo.length <= 2)
            Console.writeLine(new StringBuilder(cmdInfo[1]).reverse());
        else
            Console.writeLine("Invalid arguments for reverse command");
    }

    private static void upperCallback(String [] cmdInfo)
    {
        if (cmdInfo.length <= 2)
            Console.writeLine(cmdInfo[1].toUpperCase());
        else
            Console.writeLine("Invalid arguments for upper command");
    }

    private static void lowerCallback(String [] cmdInfo)
    {
        if (cmdInfo.length <= 2)
            Console.writeLine(cmdInfo[1].toLowerCase());
        else
            Console.writeLine("Invalid arguments for lower command");
    }

    private void chprCallback(String[] cmdInfo)
    {
        if (cmdInfo.length <= 2)
            m_cmdstr = cmdInfo[1];
        else
            Console.writeLine("Invalid argument for changePrompt");
    }

    private static void quitCallback(String[] cmdInfo)
    {
        Console.writeLine("C and System Association");
        Console.writeLine("Thanks...");
        System.exit(0);
    }

    private void parseCmdPrompt(String[] cmdText)
    {
        var index = COMMANDS.indexOf(new CommandInfo(cmdText[0]));

        if (index != -1)
            COMMANDS.get(index).consumer.accept(cmdText);
        else
            Console.Error.writeLine("Invalid command!...");
    }

    public void run()
    {
        fillCommandList(this);
        while (true) {
            var cmdText = Console.read(m_cmdstr + ">").strip();

            parseCmdPrompt(cmdText.split("[ \t]+"));
        }
    }
}
