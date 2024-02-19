package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;


public class RecursionUtilIsPangramENTest {

    @Test
    public void test()
    {
        Assert.assertTrue(RecursionUtil.isPangramEN("The quick brown fox jumps over the lazy dog"));
    }
}
