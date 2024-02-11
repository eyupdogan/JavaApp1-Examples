package org.csystem.recursion.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilWriteReverseTest {
    String s;

    public UtilWriteReverseTest(String s) {
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
       Util.writeReverse(s);
    }
}
