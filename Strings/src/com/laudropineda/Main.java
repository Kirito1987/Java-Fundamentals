package com.laudropineda;

public class Main {

    public static void main(String[] args) {
        //Examples of previous primitive types
        //byte
        //short
        //int  = frequently used
        //long
        //float
        //double = frequently used
        //char
        //boolean = frequently used

        //String = datatype class in java. Not a primitive type
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("mystring is equal to " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("mystring is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + 49.95;
        System.out.println(numberString);
        numberString = numberString + 49.95;
        System.out.println(numberString);
    }
}
