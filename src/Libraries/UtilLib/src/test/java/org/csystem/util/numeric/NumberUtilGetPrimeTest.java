package org.csystem.util.numeric;

import org.csystem.util.numeric.data.IntLongDataInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class NumberUtilGetPrimeTest {
    public IntLongDataInfo dataInfo;

    @Parameterized.Parameters
    public static Collection<IntLongDataInfo> createData()
    {
        return List.of(new IntLongDataInfo(1,2), new IntLongDataInfo(4,7),
                new IntLongDataInfo(962,7577) );
    }

    public NumberUtilGetPrimeTest(IntLongDataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.getPrime(dataInfo.input));
    }
}
