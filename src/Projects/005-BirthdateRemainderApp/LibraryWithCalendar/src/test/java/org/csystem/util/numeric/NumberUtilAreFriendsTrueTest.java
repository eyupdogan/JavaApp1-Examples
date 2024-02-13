package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
@Ignore("tested before and passed")
public class NumberUtilAreFriendsTrueTest {

    DataInfo dataInfo;
    static class DataInfo {
        int a;
        int b;


        public DataInfo(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public NumberUtilAreFriendsTrueTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(220, 284), new DataInfo(1184, 1210),
                new DataInfo(2620, 2924), new DataInfo(5020, 5564));
    }

    @Test
    public void test()
    {
        Assert.assertTrue(NumberUtil.areFriends(dataInfo.a, dataInfo.b));
    }
}
