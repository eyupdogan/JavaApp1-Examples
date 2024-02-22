package org.csystem.app;


import com.karandev.io.util.console.Console;

import java.util.Scanner;

class Application {
    public static void run(String[] args) {
        String s = "İyi bir Java programcısı olmak için [çok] {çok} çalışmak gerekir!... Sizler de iyi bir Java programcısı olacaksınız.";

        String [] words = s.split("[.! {}\\[\\]]+");

        for (int i = 0; i < words.length; ++i)
            System.out.println(words[i]);
    }
}