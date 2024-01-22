package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilGsdTest
{

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

    public RecursionUtilGsdTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(3,4,1),new DataInfo(8,18,2),new DataInfo(5,25,5),new DataInfo(2,2,2),
                new DataInfo(3,-4,1),new DataInfo(8,-18,2),new DataInfo(-5,25,5),new DataInfo(2,-2,2));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, RecursionUtil.gsd(dataInfo.a, dataInfo.b));
    }
}
