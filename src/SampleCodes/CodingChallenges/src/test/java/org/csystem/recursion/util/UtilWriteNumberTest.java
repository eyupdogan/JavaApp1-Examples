package org.csystem.recursion.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilWriteNumberTest {

    int input;

    public UtilWriteNumberTest(int input) {
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
       Util.writeNumber(input);
        System.out.println();
    }
}
