package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested before and passed")
@RunWith(Parameterized.class)
public class NumberUtilIPrimeTrueTest {

    public long input;

    @Parameterized.Parameters
    public static Collection<Long> createData()
    {
        return List.of(6285871677077738093L, 4434895834573449257L, 19L , 71L);
    }


    public NumberUtilIPrimeTrueTest(long input) {
        this.input = input;
    }

    @Test
    public void test()
    {
        Assert.assertTrue(NumberUtil.isPrime(input));
    }

}


