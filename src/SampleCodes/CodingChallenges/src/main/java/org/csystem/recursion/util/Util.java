package org.csystem.recursion.util;

public class Util {
    public static long factorial(int n)
    {
        if (n <= 0)
            return 1;

        long result = 1L;

        for (; n > 1; --n){
            result *= n;
        }

        return result;
    }

    public static int gcd(int a, int b)
    {
        int min = Math.min(Math.abs(a), Math.abs(b));

        for (int i = min; i > 1; --i)
            if (a % i == 0 && b % i == 0)
                return i;

        return 1;
    }
}
