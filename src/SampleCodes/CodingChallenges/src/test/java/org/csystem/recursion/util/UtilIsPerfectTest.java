package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilIsPerfectTest {

    int input;

    public UtilIsPerfectTest(int input) {
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
        Assert.assertTrue(Util.isPerfect(input));
    }
}
