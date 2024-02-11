package org.csystem.recursion.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilWriteReverseTest {
    String s;

    public RecursionUtilWriteReverseTest(String s) {
        this.s = s;
    }

    @Parameterized.Parameters
    public static Collection<String> createData()
    {
        return List.of("ankara", "ali", "alipapila", "", "deneme");
    }

    @Test
    public void test()
    {
       RecursionUtil.writeReverse(s);
    }
}
