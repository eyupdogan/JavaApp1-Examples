package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilIsArmstrongTest {

    int input;

    public RecursionUtilIsArmstrongTest(int input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Integer> createData()
    {
        return List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315);
    }

    @Test
    public void test()
    {
        Assert.assertTrue(RecursionUtil.isArmstrong(input));
    }
}
