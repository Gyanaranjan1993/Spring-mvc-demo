package com.gyana.design.abstractfactory;

public class HondaTransmission implements Transmission {

    private final int numOfGears;

    public HondaTransmission(int numOfGears) {
        this.numOfGears = numOfGears;
    }

    @Override
    public int changeGearRatio(int requiredRatio) {
        return numOfGears * requiredRatio;
    }
}
