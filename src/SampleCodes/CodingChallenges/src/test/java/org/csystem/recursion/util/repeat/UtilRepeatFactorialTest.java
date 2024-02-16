package org.csystem.recursion.util.repeat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilRepeatFactorialTest {

    DataInfo dataInfo;

    static class DataInfo {
        int input;
        int expected;

        public DataInfo(int input, int expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    public UtilRepeatFactorialTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(5, 120), new DataInfo(3, 6));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, UtilRepeat.factorial(dataInfo.input));
    }
}
