package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class) //parametreli test yapacağımız için bu annotation zorunlu
public class NumberUtilFibonacciTest {
    DataInfo dataInfo;

    static class DataInfo { //bu sınıf dışarda da yazılabilir
        int input;
        int expected;

        DataInfo(int a, int b)
        {
            input = a;
            expected = b;
        }
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(1, 0), new DataInfo(2, 1), new DataInfo(3, 1),
                new DataInfo(4, 2), new DataInfo(5, 3));
    }

    public NumberUtilFibonacciTest(DataInfo info) {
        dataInfo = info;
    }

    @Test
    public void givenValue_WhenIndex_ThenReturnsNumber()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.fibonacciNumber(dataInfo.input));
    }
}
