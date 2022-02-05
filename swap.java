package com.gaurav;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

//swqp number cod
//        int temp = a;
//        a=b;
//        b =temp;
        swap(a,b);
        System.out.println(  a + " " +b );

        String name = " Gaurav ";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String naam ){
        naam = " raj ";
    }
    static void swap( int a , int b ){
        int temp = a ;
        a = b ;
        b= temp;
    }
}
