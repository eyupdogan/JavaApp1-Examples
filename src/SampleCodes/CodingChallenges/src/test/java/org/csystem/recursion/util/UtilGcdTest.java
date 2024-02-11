package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilGcdTest {

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

    public UtilGcdTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(24, 36, 12), new DataInfo(100, 1000, 100), new DataInfo(-12, -3, 3));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, Util.gcd(dataInfo.a, dataInfo.b));
    }
}
