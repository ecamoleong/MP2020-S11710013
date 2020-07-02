package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        
        Car pajero=new Xenia("Xenia",3);
        pajero.startEngine();
        pajero.accelerate();
        pajero.brake();

        Car mercedesbenz =new Innova("Innova",12);
        mercedesbenz.startEngine();
        mercedesbenz.accelerate();
        mercedesbenz.brake();

        Car porsche =new Fortuner("Fortuner",4);
        porsche.startEngine();
        porsche.accelerate();
        porsche.brake();
    }
}

