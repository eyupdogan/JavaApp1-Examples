package org.csystem.app;


import org.csystem.util.console.Console;

class Application {
    public static void run(String[] args) {
        try {
            var cls = Class.forName(Console.readString("Input type:"));

            Console.writeLine("Name:%s", cls.getName());
        }
        catch (ClassNotFoundException ex) {
            Console.writeErrLine("Message:%s", ex);
        }
    }
}