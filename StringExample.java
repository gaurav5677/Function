package com.gaurav;

import java.util.Scanner;

public class StringExample {
    public static void mainswao(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print (" Enter your name ");
        String name = in.next();
        String personalised = myGreet( name);
        System.out.println( personalised);
    }

     static String myGreet(String  name) {
        String message = " hello " + name;
        return  message;

    }
}
