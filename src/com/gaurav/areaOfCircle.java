package com.gaurav;

public class areaOfCircle {
    public static double printAreaOfCircle(double radius) {
        double area = radius * radius * 3.14;
        return area;
    }

    public static void main(String[] args) {
        double radius = 5.6;
        double a = printAreaOfCircle(radius);
        System.out.println(a);
    }
}
