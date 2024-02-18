package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilReverseNumberTest {

    DataInfo dataInfo;

    static class DataInfo {
        int input;
        int expected;

        public DataInfo(int input, int expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    public RecursionUtilReverseNumberTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(3, 3), new DataInfo(3455, 5543), new DataInfo(-21, -12),
                 new DataInfo(-2341, -1432));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, RecursionUtil.reverse(dataInfo.input));
    }
}
