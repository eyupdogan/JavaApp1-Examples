package org.csystem.recursion.util.repeat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionRepeatReverseTest {

    DataInfo dataInfo;

    static class DataInfo {
        String input;
        String expected;

        public DataInfo(String input, String expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    public RecursionRepeatReverseTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo("ankara", "arakna"), new DataInfo("limbo", "obmil"),
                new DataInfo("alipapila", "alipapila"));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, RecursionRepeat.reverse(dataInfo.input));
    }
}
