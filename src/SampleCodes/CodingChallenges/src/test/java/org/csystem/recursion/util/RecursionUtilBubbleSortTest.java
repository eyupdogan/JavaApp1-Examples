package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilBubbleSortTest {

    DataInfo dataInfo;

    static class DataInfo {
        int [] input;
        int [] expected;

        public DataInfo(int[] input, int[] expected) {
            this.input = input;
            this.expected = expected;
        }
    }


    public RecursionUtilBubbleSortTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(new int[] {1, -3, 10, 4, 8, -7, 6}, new int[] {-7, -3, 1, 4, 6, 8, 10}),
                new DataInfo(new int[] {1, -30, 10, 4, 80, -7, 6}, new int[] {-30, -7, 1, 4, 6, 10, 80}));
    }

    @Test
    public void test()
    {
        Assert.assertArrayEquals(dataInfo.expected, RecursionUtil.bubbleSort(dataInfo.input));
    }
}
