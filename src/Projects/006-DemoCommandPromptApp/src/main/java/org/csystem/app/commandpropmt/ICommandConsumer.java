package org.csystem.app.commandpropmt;

@FunctionalInterface
public interface ICommandConsumer {
    public void accept(String [] cmdInfo);
}
