package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class NumberUtilGetPrimeTest {

    DataInfo dataInfo;

    static class DataInfo {
        int input;
        int expected;


        public DataInfo(int input, int expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    public NumberUtilGetPrimeTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(1, 2), new DataInfo(3, 5), new DataInfo(4, 7));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.getPrime(dataInfo.input));
    }
}
