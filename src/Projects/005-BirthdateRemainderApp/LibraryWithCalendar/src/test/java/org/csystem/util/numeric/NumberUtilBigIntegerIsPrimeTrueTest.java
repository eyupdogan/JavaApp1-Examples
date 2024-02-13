package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class NumberUtilBigIntegerIsPrimeTrueTest {
    public BigInteger input;

    public NumberUtilBigIntegerIsPrimeTrueTest(BigInteger input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<BigInteger> createData()
    {
        return List.of(BigInteger.valueOf(37), BigInteger.valueOf(17), BigInteger.valueOf(97), BigInteger.valueOf(89));
    }

    @Test
    public void test()
    {
        Assert.assertTrue(NumberUtil.isPrime(input));
    }
}
