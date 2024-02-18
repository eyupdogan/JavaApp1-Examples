package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilReverseNumberTest {

    DataInfo dataInfo;

    static class DataInfo {
        int input;
        int expected;

        public DataInfo(int input, int expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    public UtilReverseNumberTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(123, 321), new DataInfo(3455, 5543), new DataInfo(-21, -12));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, Util.reverse(dataInfo.input));
    }
}
