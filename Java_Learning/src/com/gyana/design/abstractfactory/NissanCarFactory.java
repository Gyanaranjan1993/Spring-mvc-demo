package com.gyana.design.abstractfactory;

public class NissanCarFactory implements CarFactory {

    public int numOfGears;
    private final String steeringType;

    public NissanCarFactory(String steeringType, int numOfGears) {
        this.steeringType = steeringType;
        this.numOfGears = numOfGears;
    }

    @Override
    public MusicSystem getMusicSystem() {
        return new NissanMusic();
    }

    @Override
    public Steering getSteeringSystem() {
        return new NissanSteering(this.steeringType);
    }

    @Override
    public Transmission getTransmission() {
        return new NissanTransmission(this.numOfGears);

    }
}
