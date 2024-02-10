package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class NumberUtilAreFriendsFalseTest {

    DataInfo dataInfo;
    public static class DataInfo {
        int a;
        int b;


        public DataInfo(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public NumberUtilAreFriendsFalseTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(220, 282), new DataInfo(1184, 11210),
                new DataInfo(2620, 924), new DataInfo(5020, 64));
    }

    @Test
    public void test()
    {
        Assert.assertFalse(NumberUtil.areFriends(dataInfo.a, dataInfo.b));
    }
}
