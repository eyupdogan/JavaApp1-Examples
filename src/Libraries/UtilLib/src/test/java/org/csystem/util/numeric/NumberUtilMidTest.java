package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
@Ignore("tested before and passed")
public class NumberUtilMidTest {

    public DataInfo dataInfo;

    public static class DataInfo {
        int a;
        int b;
        int c;

        int expected;


        public DataInfo(int a, int b, int c, int expected) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.expected = expected;
        }
    }

    public NumberUtilMidTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(4, 6, 12, 6), new DataInfo(100, 200, 302, 200),
                new DataInfo(23, 12,43, 23), new DataInfo(-23, -12,43, -12));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.mid(dataInfo.a, dataInfo.b, dataInfo.c));
    }
}
