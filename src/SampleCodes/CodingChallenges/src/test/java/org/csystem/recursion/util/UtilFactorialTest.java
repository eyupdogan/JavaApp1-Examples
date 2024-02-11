package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilFactorialTest {

    DataInfo dataInfo;

    static class DataInfo {
        int input;
        long expected;

        public DataInfo(int input, long expected) {
            this.input = input;
            this.expected = expected;
        }
    }


    public UtilFactorialTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(5, 120), new DataInfo(6, 720),
                new DataInfo(-4, 1));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, Util.factorial(dataInfo.input));
    }
}
