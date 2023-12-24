/*----------------------------------------------------------------------------------------------------------------------
    BigDecimal ve BigInteger sınıflarının bazı veri elemanları ile bazı değerler için yaratılmış nesnelerin referansları
    elde edilebilir. Örneğin, ONE, TEN, ZERO veri elemanları her iki sınıfta da bulunmaktadır. BigInteger sınıfına
    Java 9 ile birlikte TWO veri elemanı da eklenmiştir
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import com.karandev.io.util.console.Console;

class Application {
    public static void run(String[] args)
    {
        Sample.foo(3);
    }
}


class Sample {
    public static void foo(int x)
    {
        Console.writeLine("Giriş:%d", x);

        if (x == 0)
            return; //**

        foo(x - 1);
        Console.writeLine("Çıkış:%d", x); //***
    }
}