package org.csystem.util.numeric;

import org.csystem.util.numeric.data.LongIntDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
@Ignore("tested before and passed")
public class NumberUtilSumFactorsTest {

    LongIntDataInfo dataInfo;

    public NumberUtilSumFactorsTest(LongIntDataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<LongIntDataInfo> createData() {
        return List.of(
                new LongIntDataInfo(-2, 1),
                new LongIntDataInfo(-1, 1),
                new LongIntDataInfo(1, 1),
                new LongIntDataInfo(2, 1),
                new LongIntDataInfo(3, 1),
                new LongIntDataInfo(10, 8),
                new LongIntDataInfo(60, 108),
                new LongIntDataInfo(1000, 1340));

    }

    @Test
    public void test() {
        Assert.assertEquals(dataInfo.expected, NumberUtil.sumFactors(dataInfo.input));
    }
}
