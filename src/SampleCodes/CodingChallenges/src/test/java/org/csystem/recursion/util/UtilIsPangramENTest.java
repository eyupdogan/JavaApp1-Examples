package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class UtilIsPangramENTest {

    @Test
    public void test()
    {
        Assert.assertTrue(Util.isPangramEN("The quick brown fox jumps over the lazy dog"));
    }
}
