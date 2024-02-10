package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class NumberUtilMidBigIntegerTest {

    public DataInfo dataInfo;

    public static class DataInfo {
        BigInteger a;
        BigInteger b;
        BigInteger c;

        BigInteger expected;

        public DataInfo(BigInteger a, BigInteger b, BigInteger c, BigInteger expected) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.expected = expected;
        }
    }

    public NumberUtilMidBigIntegerTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(BigInteger.valueOf(24), BigInteger.TEN, BigInteger.valueOf(46), BigInteger.valueOf(24)),
                new DataInfo(BigInteger.valueOf(1024), BigInteger.TEN, BigInteger.valueOf(0), BigInteger.TEN));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.mid(dataInfo.a, dataInfo.b, dataInfo.c));
    }
}
