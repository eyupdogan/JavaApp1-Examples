package com.karandev.io.util.console;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class CommandPrompt {
    private Object m_regObject;
    private Method m_errorCommandMethod;
    private String m_prompt = "krn";
    private String m_suffix = "$";
    private String m_errorMessage = "Method parameters must be String";
    private String m_wrongNumberOfArgumentsMessage = "Wrong number of arguments";
    private String m_invalidCommand = "Invalid command";

    private final ArrayList<CommandInfo> m_commandInfo = new ArrayList<>();

    private static class CommandInfo {
        String commandText;
        Method method;
        int argsCount;

        public CommandInfo(String commandText, Method method, int argsCount) {
            this.commandText = commandText;
            this.method = method;
            this.argsCount = argsCount;
        }
    }

    private CommandPrompt()
    {
    }

    public static class Builder {
        private final CommandPrompt m_commandPrompt = new CommandPrompt();

        private Builder()
        {
        }

        public Builder registerObject(Object regObject)
        {
            m_commandPrompt.m_regObject = regObject;
            return this;
        }

        public Builder setPrompt(String prompt)
        {
            m_commandPrompt.m_prompt = prompt;
            return this;
        }

        public Builder setSuffix(String suffix)
        {
            m_commandPrompt.m_suffix = suffix;
            return this;
        }

        public Builder setErrorMessage(String message)
        {
            m_commandPrompt.m_errorMessage = message;
            return this;
        }

        public Builder setWrongNumberOfArgumentsMessage(String message)
        {
            m_commandPrompt.m_wrongNumberOfArgumentsMessage = message;
            return this;
        }

        public Builder setInvalidCommandMessage(String message)
        {
            m_commandPrompt.m_invalidCommand = message;
            return this;
        }

        public CommandPrompt create()
        {
            return m_commandPrompt;
        }
    }

    public static Builder createBuilder()
    {
        return new Builder();
    }

    public void run()
    {

    }
}
