package com.multiplatform;

public class Innova extends Car{
    public Innova(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Innova car engine turns on");
    }

    @Override
    public void accelerate() {
        System.out.println("Innova car Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Innova car brakes");
    }

}
