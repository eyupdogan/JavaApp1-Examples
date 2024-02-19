package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RecursionUtilIsPerfectTest {

    int input;

    public RecursionUtilIsPerfectTest(int input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Integer> createData()
    {
        return List.of(6, 28, 496, 8128, 33550336);
    }

    @Test
    public void test()
    {
        Assert.assertTrue(RecursionUtil.isPerfect(input));
    }
}
