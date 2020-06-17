package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        printMegabytesAndKilobytes(2500);
        printMegabytesAndKilobytes(-1024);
        printMegabytesAndKilobytes(5000);
    }
    public static void printMegabytesAndKilobytes(int kiloBytes){
        int megabytes = kiloBytes / 1024;
        int remKilobytes = kiloBytes % 1024;

        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        System.out.println(kiloBytes + " KB = " + megabytes + " MB = " + remKilobytes + " KB");
    }

}
