package org.csystem.app;


import com.karandev.io.util.console.Console;
import org.csystem.util.numeric.NumberUtil;

import java.util.Random;

class Application {
    public static void run(String[] args)
    {
        var random = new Random();

        IIntBinaryOperator ibo = IntOperation::multiply; //(a, b) -> IntOperation.multiply(a, b);

        Console.writeLine(ibo.applyAsInt(3, 5));
        Console.writeLine("------------------------------------------------------------------");

        ibo = Integer::sum;
        Console.writeLine(ibo.applyAsInt(3, 4));
        Console.writeLine("------------------------------------------------------------------");

        IIntPredicate intPredicate = NumberUtil::isPrime;
        Console.writeLine(intPredicate.test(1_000_003));
        Console.writeLine("------------------------------------------------------------------");

        IIntSupplier intSupplier = random::nextInt;
        Console.writeLine(intSupplier.get());
        Console.writeLine("------------------------------------------------------------------");

        IIntRandomBoundSupplier intRandomBoundSupplier = Random::nextInt;
        Console.writeLine(intRandomBoundSupplier.get(random, 100));
        Console.writeLine("------------------------------------------------------------------");

        IStringToIntConverter converter = String::length;
        Console.writeLine(converter.convert("ankara"));
        Console.writeLine("------------------------------------------------------------------");

        IIntValueFactory intValueFactory = IntValue::new;
        Console.writeLine(intValueFactory.create(4));
        Console.writeLine("------------------------------------------------------------------");

        IIntValueDefaultFactory intValueDefaultFactory = IntValue::new;
        Console.writeLine(intValueDefaultFactory.create());
        Console.writeLine("------------------------------------------------------------------");
    }
}

class IntOperation {
    public static int multiply(int a, int b)
    {
        return a * b;
    }
}

class IntValue {
    private int m_value;

    public IntValue()
    {
    }

    public IntValue(int value)
    {
        m_value = value;
    }

    public int getValue()
    {
        return m_value;
    }

    //...
}

interface IIntValueFactory {
    IntValue create(int val);
}

interface IIntValueDefaultFactory {
    IntValue create();
}

interface IIntBinaryOperator {
    int applyAsInt(int a, int b);
}

interface IIntPredicate {
    boolean test(int a);
}

interface IIntSupplier {
    int get();
}

interface IIntRandomBoundSupplier {
    int get(Random random, int bound);
}

interface IStringToIntConverter {
    int convert(String str);
}