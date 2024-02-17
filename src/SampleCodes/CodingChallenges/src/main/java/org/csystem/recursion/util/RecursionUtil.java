package org.csystem.recursion.util;

public class RecursionUtil {

    private static int arraySum(int [] arr, int n)
    {
        if (n < 0)
            return 0;

        return arr[n] + arraySum(arr, n - 1);
    }

    private static void bubbleSort(int [] arr, int idx, int length)
    {
        if (idx + 1 == length)
            return;

        for (int i = 0; i < length - 1 - idx; ++i)
            if (arr[i + 1] < arr[i])
                swap(arr, i + 1, i);

        bubbleSort(arr, idx + 1, length);
    }

    private static int fibonacciNumberRecur(int n)
    {
        return n <= 2 ? n - 1 : fibonacciNumberRecur(n - 1) + fibonacciNumberRecur(n - 2);
    }

    private static int gcdRecur(int a, int b)
    {
        return b == 0 ? a : gcdRecur(b, a % b);
    }

    private static boolean isPrime(int val, int start)
    {
        if (val % start == 0)
            return false;

        if (start * start > val)
            return true;

        return isPrime(val, start + 2);
    }

    private static int maxArrayElement(int [] arr, int idx)
    {
        if (idx == 1)
            return arr[0];

        return Math.max(arr[idx], maxArrayElement(arr, idx - 1));
    }

    private static void reverse(char [] chars, int left, int right)
    {
        if (left >= right)
            return;

        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;

        reverse(chars, left + 1, right - 1);
    }

    private static void swap(int [] arr, int i, int k)
    {
        var temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }

    private static void writeNumberRecur(int val)
    {
        if ((val / 10) != 0)
            writeNumberRecur(val / 10);

        System.out.write((char)(val % 10 + '0'));
    }

    private static void writeReverse(String s, int i)
    {
        if (i == s.length())
            return;

        writeReverse(s, i + 1);

        System.out.print(s.charAt(i));
    }

    public static int arraySum(int [] arr)
    {
        return arraySum(arr, arr.length - 1);
    }

    public static int [] bubbleSort(int [] arr)
    {
        for (int i = 0; i < arr.length; ++i)
            bubbleSort(arr, i, arr.length);

        return arr;
    }

    public static long factorial(int n)
    {
        if (n <= 0)
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

    public static boolean isPrime(int val)
    {
        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        if (val % 11 == 0)
            return val == 11;

        return isPrime(val, 11);
    }

    public static int maxArrayElement(int [] arr)
    {
        return maxArrayElement(arr, arr.length - 1);
    }

    public static String reverse(String s)
    {
        var chars = s.toCharArray();

        reverse(chars, 0, s.length() - 1);

        return String.valueOf(chars);
    }


    public static long power(int val, int exponent)
    {
        if (exponent == 1)
            return val;
        return val * power(val, exponent - 1);
    }

    public static int sumOfOddNumbers(int n)
    {
        if (n <= 0)
            return 0;

        return (n % 2 != 0 ? n : 0) + sumOfOddNumbers(n - 1);
    }

    public static void writeNumber(int val)
    {
        if (val < 0) {
            System.out.write('-');
            val = -val;
        }
        writeNumberRecur(val);
    }

    public static void writeReverse(String s)
    {
        writeReverse(s, 0);
    }

    public static void writeCollatz(int val)
    {
        if (val <= 0) {
            System.out.println("Invalid value");
            return;
        }

        System.out.printf("%d ", val);

        if (val == 1)
            return;
        writeCollatz(val % 2 == 0 ? val / 2 : 3 * val + 1);
    }
}
