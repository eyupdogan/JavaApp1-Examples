package org.csystem.app;

import com.karandev.io.util.console.Console;

import java.lang.reflect.Parameter;

import static com.karandev.io.util.console.CommandLineArgs.checkLengthEquals;

class Application {

    private static void printConstructors(Class<?> cls)
    {
        try {
            Console.writeLine("-------------");
            Console.writeLine("Constructors:");
            Console.writeLine("-------------");
            for (var ctor : cls.getDeclaredConstructors())
                Console.writeLine("%s(%s)", cls.getSimpleName(), getParametersStr(ctor.getParameters()));
        }
        catch (Throwable ex) {
            Console.Error.writeLine("Field exception:%s", ex.getMessage());
        }
    }

    private static void printAnnotations(Class<?> cls)
    {
        try {
            Console.writeLine("-------------");
            Console.writeLine("Annotations:");
            Console.writeLine("-------------");
            for (var annotation : cls.getDeclaredAnnotations())
                Console.writeLine("@%s", annotation.annotationType().getSimpleName());
        }
        catch (Throwable ex) {
            Console.Error.writeLine("Field exception:%s", ex.getMessage());
        }
    }

    private static void printSuperClass(Class<?> cls)
    {
        try {
            Console.writeLine("-------------");
            Console.writeLine("Super Class:");
            Console.writeLine("-------------");
                Console.writeLine("@%s", cls.getSuperclass().getSimpleName());
        }
        catch (Throwable ex) {
            Console.Error.writeLine("Field exception:%s", ex.getMessage());
        }
    }

    private static void printInterfaces(Class<?> cls)
    {
        try {
            Console.writeLine("-------------");
            Console.writeLine("Interfaces:");
            Console.writeLine("-------------");
            for (var i : cls.getInterfaces())
                Console.writeLine("@%s", i.getSimpleName());
        }
        catch (Throwable ex) {
            Console.Error.writeLine("Field exception:%s", ex.getMessage());
        }
    }

    private static void printFields(Class<?> cls)
    {
        try {
            Console.writeLine("-------------");
            Console.writeLine("Fields:");
            Console.writeLine("-------------");
            for (var field : cls.getDeclaredFields())
                Console.writeLine("%s %s", field.getType().getSimpleName(), field.getName());
        }
        catch (Throwable ex) {
            Console.Error.writeLine("Field exception:%s", ex.getMessage());
        }
    }

    private static String getParametersStr(Parameter [] parameters)
    {
        var sb = new StringBuilder();

        for (var param : parameters)
            sb.append(param.getType().getSimpleName()).append(' ').append(param.getName()).append(", ");

        return sb.isEmpty() ? "" : sb.substring(0, sb.length() - ", ".length());
    }

    private static void printMethods(Class<?> cls)
    {
        try {
            Console.writeLine("-------------");
            Console.writeLine("Methods:");
            Console.writeLine("-------------");
            for (var method : cls.getDeclaredMethods())
                Console.writeLine("%s %s(%s)", method.getReturnType().getSimpleName(), method.getName(),
                        getParametersStr(method.getParameters()));


        }
        catch (Throwable ex) {
            Console.Error.writeLine("Field exception:%s", ex.getMessage());
        }
    }

    private static void printDeclaredMetaData(Class<?> cls)
    {
        printAnnotations(cls);
        printSuperClass(cls);
        printInterfaces(cls);
        printFields(cls);
        printConstructors(cls);
        printMethods(cls);
    }

    public static void run(String[] args)
    {
        checkLengthEquals(args.length, 1, "usage: java -jar DemoReflectionApp-11.1.0.jar  <fully qualified typename>");

        try {
            printDeclaredMetaData(Class.forName(args[0]));
        }
        catch (ClassNotFoundException ignore) {
            Console.Error.writeLine("cannot find type:%s", args[0]);
        }
        catch (Throwable ex) {
            Console.Error.writeLine("Exception occurred:%s", ex.getMessage());
        }
    }
}
