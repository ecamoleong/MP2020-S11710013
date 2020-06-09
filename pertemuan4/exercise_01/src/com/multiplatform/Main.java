package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = 300;
        int intValue = 200;

        long longTotal = 50000 + 10L * (byteValue + shortValue + intValue);
        System.out.println("longTotal = " + longTotal);
    }
}
