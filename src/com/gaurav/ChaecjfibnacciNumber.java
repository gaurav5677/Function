package com.gaurav;

import java.util.Scanner;

public class ChaecjfibnacciNumber {
    public static void main(String[] args) {
        Cheak();
    }

    public static void  Cheak() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int c;
        while (a < n) {
            c = a + b;
            a = b;
            b = c;

        }
        if (a == n) {
            System.out.println(" true");


        } else {
            System.out.println(" false");
        }
    }
}
