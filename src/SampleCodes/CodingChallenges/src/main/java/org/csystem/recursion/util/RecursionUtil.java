package org.csystem.recursion.util;

public class RecursionUtil {

    private static int gscRecur(int a, int b)
    {
        return b == 0 ? a : gscRecur(b, a % b);
    }
    public static long factorial(int n)
    {
        if (n <= 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static int gsd(int a, int b)
    {
        return gscRecur(Math.abs(a), Math.abs(b));
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

    public static String reverse(String s)
    {
        char [] chars = s.toCharArray();

        reverse(chars, 0, s.length() - 1);

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverse("deneme"));
    }

    private static void writeReverse(String s, int i)
    {
        if (i == s.length())
            return;

        writeReverse(s, i + 1);
        System.out.print(s.charAt(i));
    }

    public static void writeReverse(String s)
    {
        writeReverse(s, 0);
    }

}
