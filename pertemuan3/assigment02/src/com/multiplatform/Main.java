package com.multiplatform;

public class Main {
    public static void main(String[] args) {
        byte mybyteValue = 100;
        short myshortValue = 1000;
        long mylongValue = 10000;

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Byte Minimum Value = " + myMinByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Short Minimum Value = " + myMinShortValue);

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Long Minimum Value = " + myMinLongValue);
    }
}
