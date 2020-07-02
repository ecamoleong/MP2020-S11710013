package com.multiplatform;

public class Xenia extends Car{
    public Xenia(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Xenia car engine turns on");
    }

    @Override
    public void accelerate() {
        System.out.println("Xenia car Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Xenia car brakes");
    }

}
