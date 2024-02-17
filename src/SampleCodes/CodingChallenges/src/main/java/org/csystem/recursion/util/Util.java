package org.csystem.recursion.util;

public class Util {
    public static long factorial(int n)
    {
        if (n <= 0)
            return 1;

        var result = 1L;

        for (; n > 1; --n)
            result *= n;

        return result;
    }

    public static int gcd(int a, int b)
    {
        int min = Math.min(Math.abs(a), Math.abs(b));

        for (int i = min; i >= 2; --i) {
            if (a % i == 0 && b % i == 0)
                return i;
        }

        return 1;
    }

    public static String reverse(String s)
    {
        var chars = s.toCharArray();
        var left = 0;
        var right = s.length() - 1;

        while (left < right) {
            char temp = chars[left];

            chars[left++] = chars[right];
            chars[right--] = temp;
        }

        return String.valueOf(chars);

    }

    public static void writeReverse(String s)
    {
        for (int i = s.length() - 1; i >= 0; --i)
            System.out.print(s.charAt(i));
    }

    public static int fibonacciNumber(int n)
    {
        if (n <= 0)
            return -1;

        if (n <= 2)
            return n - 1;

        int prev1 = 1, prev2 = 0, result = 0;

        for (var i = 2; i < n; ++i) {
            result = prev1 + prev2;
            prev2 = prev1;
            prev1 = result;
        }

        return result;
    }

    public static void writeNumber(int val)
    {
        if (val == 0) {
            System.out.write('0');
            return;
        }

        char [] s = new char[11];
        var isNegative = false;
        int i;

        if (val < 0) {
            isNegative = true;
            val = -val;
        }

        for (i = 0; val != 0; ++i, val /= 10)
            s[i] = (char)(val % 10 + '0');

        if (isNegative)
            s[i++] = '-';

        for (--i; i >= 0; --i)
            System.out.write(s[i]);

    }

    public static long power(int val, int exponent)
    {
        int result = 1;
        for (int i = 0; i < exponent; ++i)
            result *= val;

        return result;
    }

    public static void writeCollatz(int val)
    {
        if (val <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz:");
            return;
        }


        System.out.printf("%d ", val);

        while (val != 1) {
            val = val % 2 == 0 ? val / 2 : 3 * val + 1;
            System.out.printf("%d ", val);
        }
    }
}
