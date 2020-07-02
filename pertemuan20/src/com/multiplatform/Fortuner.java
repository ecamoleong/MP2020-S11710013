package com.multiplatform;

public class Fortuner extends Car{
    public Fortuner(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Fortuner car engine turns on");
    }

    @Override
    public void accelerate() {
        System.out.println("Fortuner car Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Fortuner car brakes");
    }

}
