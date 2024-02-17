package org.csystem.recursion;

import org.csystem.recursion.util.RecursionUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilMaxArrayElementTest {

    DataInfo dataInfo;

    static class DataInfo {
        int [] inputArr;
        int expected;

        public DataInfo(int[] inputArr, int expected) {
            this.inputArr = inputArr;
            this.expected = expected;
        }
    }

    public RecursionUtilMaxArrayElementTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(new int []{1, 2, 4, 6}, 6), new DataInfo(new int[] {3, -2, -4, 5}, 5));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, RecursionUtil.maxArrayElement(dataInfo.inputArr));
    }
}
