package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilPowerTest {

    DataInfo dataInfo;

    static class DataInfo {
        int input;
        int exponent;
        long expected;

        public DataInfo(int input, int exponent, long expected) {
            this.input = input;
            this.exponent = exponent;
            this.expected = expected;
        }
    }

    public UtilPowerTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(5, 2, 25), new DataInfo(3, 4, 81),
                new DataInfo(5, 3, 125));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, Util.power(dataInfo.input, dataInfo.exponent));
    }
}
