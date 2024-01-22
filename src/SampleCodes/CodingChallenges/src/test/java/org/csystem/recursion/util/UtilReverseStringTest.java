package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilReverseStringTest {

    DataInfo dataInfo;

    static class DataInfo {
        String s1;
        String expected;

        public DataInfo(String s1, String expected) {
            this.s1 = s1;
            this.expected = expected;
        }
    }

    public UtilReverseStringTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo("deneme", "emened"), new DataInfo("kakashi", "ihsakak"));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, Util.reverse(dataInfo.s1));
    }
}
