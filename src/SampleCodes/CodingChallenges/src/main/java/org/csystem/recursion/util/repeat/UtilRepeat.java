package org.csystem.recursion.util.repeat;

public class UtilRepeat {
    public static int factorial(int n)
    {
        int result = 1;
        if (n <= 1)
            return 1;

        for (int i = 2; i <= n; ++i)
            result *= i;

        return result;
    }

    public static int fibonacciNumber(int n)
    {
        if (n < 0)
            return -1;

        if (n <= 2)
            return n - 1;

        int prev1 = 1;
        int prev2 = 0;
        int result = 0;

        for (int i = 3; i <= n; ++i) {
            result = prev1 + prev2;
            prev2 = prev1;
            prev1 = result;
        }

        return result;
    }

    public static int gcd(int a, int b)
    {
        int result = 1;
        int min = Math.min(Math.abs(a), Math.abs(b));

        for (int i = min; i >= 1; --i) {
            if (a % i == 0 && b % i == 0)
                return i;
        }


        return result;
    }

    public static String reverse(String s)
    {
        int left = 0;
        int right = s.length() - 1;
        char [] chars = s.toCharArray();

        while (left < right) {
            char temp = s.charAt(left);
            chars[left++] = chars[right];
            chars[right--] = temp;
        }


        return String.valueOf(chars);
    }
}
