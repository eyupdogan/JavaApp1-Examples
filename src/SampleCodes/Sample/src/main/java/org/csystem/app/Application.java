package org.csystem.app;

import org.csystem.util.console.Console;

class Application {
    public static void run(String[] args)
    {
        var a = new A();
        var b = a.new B();

        b.foo();

        //...
    }
}

class A {
    //...
    public void foo()
    {
        Console.writeLine("A.foo");
    }

    public class B {
        //...
        public void foo()
        {
            Console.writeLine("B.foo");
            A.this.foo();
        }
    }
}