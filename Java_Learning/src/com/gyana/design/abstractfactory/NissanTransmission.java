package com.gyana.design.abstractfactory;

public class NissanTransmission implements Transmission {

    private final int numOfGears;

    public NissanTransmission(int numOfGears) {
        this.numOfGears = numOfGears;
    }

    @Override
    public int changeGearRatio(int requiredRatio) {
        return numOfGears * requiredRatio * 2;
    }
}
