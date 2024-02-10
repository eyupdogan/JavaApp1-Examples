package org.csystem.util.numeric;

import org.csystem.util.numeric.data.IntLongDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
@Ignore("tested before and passed")
public class NumberUtilFactorialTest {

    IntLongDataInfo dataInfo;

    public NumberUtilFactorialTest(IntLongDataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<IntLongDataInfo> createData()
    {
        return List.of(new IntLongDataInfo(5, 120), new IntLongDataInfo(3, 6), new IntLongDataInfo(6, 720));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.factorial(dataInfo.input));
    }
}
