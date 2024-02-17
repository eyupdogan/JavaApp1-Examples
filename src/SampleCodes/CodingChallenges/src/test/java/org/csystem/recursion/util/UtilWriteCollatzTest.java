package org.csystem.recursion.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilWriteCollatzTest {

    int input;

    public UtilWriteCollatzTest(int input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Integer> createData()
    {
        return List.of(72543);
    }

    @Test
    public void test()
    {
        Util.writeCollatz(input);
    }
}
