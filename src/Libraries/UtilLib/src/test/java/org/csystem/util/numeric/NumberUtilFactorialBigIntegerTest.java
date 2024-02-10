package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class NumberUtilFactorialBigIntegerTest {

    public DataInfo dataInfo;

    static class DataInfo {
        int input;
        BigInteger expected;

        public DataInfo(int input, BigInteger expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    public NumberUtilFactorialBigIntegerTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }


    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(5, BigInteger.valueOf(120)),
                new DataInfo(6, BigInteger.valueOf(720)),
                new DataInfo(10, BigInteger.valueOf(3628800))
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.factorialBigInteger(dataInfo.input));
    }
}
