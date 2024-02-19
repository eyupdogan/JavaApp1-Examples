package org.csystem.app;


import org.csystem.util.console.Console;

import java.util.Random;

class Application {
    public static void run(String[] args)
    {
        var random = new Random();

        IIntBinaryOperator intOp = (a, b) -> a * b;
        IDoubleBinaryOperator doubleOp = (a, b) -> {Console.writeLine("%f + %f = %f", a, b, a + b); return a + b;};
        IIntSupplier supplier = () -> random.nextInt(100);
        IIntConsumer consumer = a -> Console.writeLine("%d ", a);

        Console.writeLine(intOp.applyAsInt(3, 4));
        Console.writeLine(doubleOp.applyAsDouble(3., 4.5));
        Console.writeLine(supplier.get());
        consumer.accept(4);
    }
}

interface IIntBinaryOperator {
    int applyAsInt(int a, int b);
}


interface IDoubleBinaryOperator {
    double applyAsDouble(double a, double b);
}

interface IIntSupplier {
    int get();
}

interface IIntConsumer {
    void accept(int a);
}