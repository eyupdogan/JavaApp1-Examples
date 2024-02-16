package org.csystem.recursion.util.repeat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilRepeatFibonacciTest {

    DataInfo dataInfo;

    static class DataInfo {
        int n;
        int expected;

        public DataInfo(int n, int expected) {
            this.n = n;
            this.expected = expected;
        }
    }

    public UtilRepeatFibonacciTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(3, 1), new DataInfo(4, 2), new DataInfo(5, 3), new DataInfo(6, 5), new DataInfo(7, 8), new DataInfo(8, 13));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, UtilRepeat.fibonacciNumber(dataInfo.n));
    }
}
