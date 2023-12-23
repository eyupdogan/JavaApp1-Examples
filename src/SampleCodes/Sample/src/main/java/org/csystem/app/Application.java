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

import java.math.BigInteger;

class Application {
    public static void run(String[] args)
    {
        var count = Console.readBigInteger("Input count:");

        for (var i = BigInteger.ZERO; i.compareTo(count) < 0; i = i.add(BigInteger.ONE))
            Console.writeLine(i);
    }
}