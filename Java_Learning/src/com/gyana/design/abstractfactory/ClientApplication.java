package com.gyana.design.abstractfactory;

import java.util.Scanner;

public class ClientApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter What car you want : ");

        String input = scanner.nextLine();

        CarFactory carFactory = FactoryProvider.createFactory(input,"small",4);
        carFactory.getMusicSystem().playMusic("Demo");
        System.out.println(carFactory.getSteeringSystem().getSteeringWheelRadius());
        System.out.println(carFactory.getTransmission().changeGearRatio(5));
    }
}
