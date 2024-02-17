package org.csystem.recursion.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UtilIsPrimeTest {

    int input;

    public UtilIsPrimeTest(int input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Integer> createData()
    {
        return List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
    }

    @Test
    public void test()
    {
        Assert.assertTrue(Util.isPrime(input));
    }
}
