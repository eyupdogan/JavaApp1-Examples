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

    private static int countDigits(int val)
    {
        int count = val == 0 ? 1 : 0;

        while (val != 0) {
            ++count;
            val /= 10;
        }
        return count;
    }

    private static int fibonacciNumberRecur(int n)
    {
        return n <= 2 ? n - 1 : fibonacciNumberRecur(n - 1) + fibonacciNumberRecur(n - 2);
    }

    private static int gcdRecur(int a, int b)
    {
        return b == 0 ? a : gcdRecur(b, a % b);
    }

    private static int isArmstrong(int val, int countDigits)
    {
        int temp = val % 10;
        val /= 10;

        if (temp == 0 && val == 0)
            return 0;

        return (int)Math.pow(temp, countDigits) + isArmstrong(val, countDigits);
    }

    private static int isPerfect(int val, int i)
    {
        if (i > val / 2)
            return 0;

        return  val % i == 0 ? i + isPerfect(val, i + 1) : isPerfect(val, i + 1);
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

    private static int reverse(int val, int result)
    {
        return val == 0 ? result : reverse(val / 10, result * 10 + val % 10);
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

    public static boolean isArmstrong(int val)
    {
        if (val < 0)
            return false;

        System.out.println(isArmstrong(val, countDigits(val)));

        return isArmstrong(val, countDigits(val)) == val;
    }

    private static int sumFactors(long val, long sqrtVal, int i)
    {
        if (i > sqrtVal)
            return 0;

        if (val % i == 0)
            return (int)((i == val / i) ? i : (i + val / i)) + sumFactors(val, sqrtVal, i + 1);
        else
            return sumFactors(val, sqrtVal, i + 1);
    }

    public static int sumFactors(long val)
    {
        long sqrtVal = (long) Math.sqrt(val);
        return 1 + sumFactors(val, sqrtVal, 2);
    }

    public static boolean isPerfect(int val)
    {
        if (val <= 0)
            return false;

        return val == sumFactors(val);
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

    public static int reverse(int val)
    {
        return val < 0 ? -reverse(Math.abs(val), 0) : reverse(val, 0);
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
