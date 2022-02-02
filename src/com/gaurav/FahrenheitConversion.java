package com.gaurav;

import java.util.Scanner;

public class FahrenheitConversion {

    public static void main(String[] args) {

        printFahrenheitTable();

    }


    public static void printFahrenheitTable() {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print the specified output in required format.
         * Taking input is handled automatically.
         */
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();

        int end = s.nextInt();

        int step = s.nextInt();
        int currentValue = start;
        while (currentValue <= end) {
            int fahrenheitValue = (int) ((5.0 / 9) * (currentValue - 32));
            System.out.println(currentValue + "\t" + fahrenheitValue);
            currentValue += step;

        }
    }


}




