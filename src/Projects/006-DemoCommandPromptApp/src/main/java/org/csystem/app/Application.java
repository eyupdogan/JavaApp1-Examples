package org.csystem.app;


import org.csystem.app.commandpropmt.CommandPrompt;

class Application {
    public static void run(String[] args)
    {
        var cp = new CommandPrompt("csd");

        cp.run();
    }
}
