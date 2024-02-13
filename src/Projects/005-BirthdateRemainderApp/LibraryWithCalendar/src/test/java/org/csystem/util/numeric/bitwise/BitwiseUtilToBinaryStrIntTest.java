package org.csystem.util.numeric.bitwise;

import org.csystem.util.bitwise.BitwiseUtil;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
@Ignore
public class BitwiseUtilToBinaryStrIntTest {

    DataInfo dataInfo;
    static class DataInfo {
        int input;
        String expected;

        public DataInfo(int input, String expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    public BitwiseUtilToBinaryStrIntTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(-10, "11111111111111111111111111110110"),
                       new DataInfo(10,  "00000000000000000000000000001010"),
                       new DataInfo(0, "00000000000000000000000000000000"),
                       new DataInfo(-1, "11111111111111111111111111111111"));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, BitwiseUtil.toBinaryStr(dataInfo.input));
    }
}
