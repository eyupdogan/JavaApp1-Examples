package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
@Ignore
public class NumberUtilSumFactorsTest {

    DataInfo dataInfo;

    static class DataInfo {
        long input;
        int expected;


        public DataInfo(int input, int expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    public NumberUtilSumFactorsTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(8, 5), new DataInfo(20, 10));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.sumFactors(dataInfo.input));
    }
}
