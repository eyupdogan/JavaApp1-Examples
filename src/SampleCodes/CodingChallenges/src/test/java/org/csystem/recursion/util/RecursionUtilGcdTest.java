package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilGcdTest {

    DataInfo dataInfo;

    static class DataInfo {
        int a;
        int b;
        int expected;

        public DataInfo(int a, int b, int expected) {
            this.a = a;
            this.b = b;
            this.expected = expected;
        }
    }

    public RecursionUtilGcdTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(24, 8, 8), new DataInfo(44, 11, 11), new DataInfo(45, 17, 1));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, RecursionUtil.gcd(dataInfo.a, dataInfo.b));
    }
}
