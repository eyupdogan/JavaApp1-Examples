package org.csystem.recursion.util.repeat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilRepeatGcdTest {

    static DataInfo dataInfo;

    static class DataInfo {
        int expected;
        int a;
        int b;

        public DataInfo(int expected, int a, int b) {
            this.expected = expected;
            this.a = a;
            this.b = b;
        }
    }

    public UtilRepeatGcdTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(1, 3, 4), new DataInfo(10, 30, 20),
                new DataInfo(5, -25, 15), new DataInfo(8, 32, 24));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, UtilRepeat.gcd(dataInfo.a, dataInfo.b));
    }
}
