package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilArraySumTest {

    DataInfo dataInfo;

    static class DataInfo {
        int [] inputArr;
        int expected;

        public DataInfo(int[] inputArr, int expected) {
            this.inputArr = inputArr;
            this.expected = expected;
        }
    }

    public RecursionUtilArraySumTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(new int []{1, 2, 4, 6}, 13), new DataInfo(new int[] {3, -2, -4, 3}, 0));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, RecursionUtil.arraySum(dataInfo.inputArr));
    }
}
