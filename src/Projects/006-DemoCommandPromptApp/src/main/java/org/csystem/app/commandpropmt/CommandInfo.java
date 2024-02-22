package org.csystem.app.commandpropmt;

public class CommandInfo {
    public String cmdText;

    public ICommandConsumer consumer;

    public CommandInfo(String cmdText)
    {
        this.cmdText = cmdText;
    }

    public CommandInfo(String cmdText, ICommandConsumer consumer) {
        this.cmdText = cmdText;
        this.consumer = consumer;
    }


    @Override
    public boolean equals(Object other) {
        return other instanceof CommandInfo ci && ci.cmdText.equals(cmdText);
    }
}
