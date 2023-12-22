/*----------------------------------------------------------------------------------------------------------------------
	Öncelikle long türünde bir input field ı oluşturuyoruz
    Sonra @Parameterized.Parameters ile işaretlenmiş collection oluşturuyoruz
    Sonra sınıfın constructor ını yazıyoruz
    Sonra da testi çalıştırıyoruz
-----------------------------------------------------------------------------------------------------------------------*/
// NumberUtilIsPrimeTest
package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class NumberUtilIsPrimeFalseTest {
    public long input;

    @Parameterized.Parameters
    public static Collection<Long> createData()
    {
        return List.of(33L, 345L, 324L);
    }

    public NumberUtilIsPrimeFalseTest(long input) {
        this.input = input;
    }

    @Test
    public void test()
    {
        int input = 4;

        Assert.assertFalse(NumberUtil.isPrime(input));
    }
}
