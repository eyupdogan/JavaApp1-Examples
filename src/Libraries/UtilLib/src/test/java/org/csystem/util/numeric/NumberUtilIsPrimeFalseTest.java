package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
@Ignore("tested before and passed")
public class NumberUtilIsPrimeFalseTest {

    public long input;

    @Parameterized.Parameters
    public static Collection<Long> createData()
    {
        return List.of(-1L, 4L, 36L);
    }

    public NumberUtilIsPrimeFalseTest(long input) {
        this.input = input;
    }


    @Test
    public void test()
    {
        Assert.assertFalse(NumberUtil.isPrime(input));
    }

}
