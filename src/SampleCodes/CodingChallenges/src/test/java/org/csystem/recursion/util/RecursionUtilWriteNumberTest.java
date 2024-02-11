package org.csystem.recursion.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilWriteNumberTest {
    int input;

    public RecursionUtilWriteNumberTest(int input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Integer> createData()
    {
        return List.of(0, 123, -1246, -5342, 6767);
    }

    @Test
    public void test()
    {
        RecursionUtil.writeNumber(input);
        System.out.println();
    }
}
