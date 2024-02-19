package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilSumFactorsTest {

    DataInfo dataInfo;

    static class DataInfo {
        long input;
        int expected;

        public DataInfo(long input, int expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    public UtilSumFactorsTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(30, 42), new DataInfo(15, 9),
                new DataInfo(6, 6), new DataInfo(33550336, 33550336));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, Util.sumFactors(dataInfo.input));
    }
}
