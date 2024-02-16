package org.csystem.recursion.util.repeat;

public class RecursionRepeat {

    private static int fibonacciNumberRecur(int n)
    {
        return n <= 2 ? n - 1 : fibonacciNumberRecur(n - 1) + fibonacciNumberRecur(n - 2);
    }

    private static int gcdRecur(int a, int b)
    {
        return b == 0 ? a : gcdRecur(b, a % b);
    }

    private static void reverseRecur(char [] chars, int left, int right)
    {
        if (left > right)
            return;

        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;

        reverseRecur(chars, left + 1, right - 1);
    }

    public static int factorial(int n)
    {
        if (n <= 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static int fibonacciNumber(int n)
    {
        return n <= 0 ? -1 : fibonacciNumberRecur(n);
    }

    public static int gcd(int a, int b)
    {
        return gcdRecur(Math.abs(a), Math.abs(b));
    }

    public static String reverse(String s)
    {
        char [] chars = s.toCharArray();

        reverseRecur(chars, 0, chars.length - 1);

        return String.valueOf(chars);
    }
}
