package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilFibonacciNumberTest {

    DataInfo dataInfo;

    static class DataInfo {
        int n;
        int expected;

        public DataInfo(int n, int expected) {
            this.n = n;
            this.expected = expected;
        }
    }

    public UtilFibonacciNumberTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(1, 0), new DataInfo(3, 1), new DataInfo(4, 2),
                new DataInfo(5, 3), new DataInfo(6, 5));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, Util.fibonacciNumber(dataInfo.n));
    }
}
