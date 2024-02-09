package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class NumberUtilReverseTest {

    DataInfo dataInfo;

    static class DataInfo {
        int input;
        int expected;

        public DataInfo(int input, int expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    public NumberUtilReverseTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(321, 123), new DataInfo(12345, 54321), new DataInfo(6778, 8776));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.reverse(dataInfo.input));
    }
}
