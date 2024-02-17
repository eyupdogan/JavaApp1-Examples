package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilSumOfOddNumbersTest {

    DataInfo dataInfo;

    static class DataInfo {
        int n;
        int expected;

        public DataInfo(int n, int expected) {
            this.n = n;
            this.expected = expected;
        }
    }

    public RecursionUtilSumOfOddNumbersTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(10, 25), new DataInfo(12, 36));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, RecursionUtil.sumOfOddNumbers(dataInfo.n));
    }
}
