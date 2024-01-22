package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilReverseTest {

    DataInfo dataInfo;

    static class DataInfo {
        String s;
        String expected;

        public DataInfo(String s, String expected) {
            this.s = s;
            this.expected = expected;
        }
    }

    public RecursionUtilReverseTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo("ankara", "arakna"), new DataInfo("ali", "ila"),
                new DataInfo("kotlin", "niltok"));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, RecursionUtil.reverse(dataInfo.s));
    }
}
