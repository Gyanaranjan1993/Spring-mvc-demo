package com.gyana.design.abstractfactory;

public class HondaCarFactory implements CarFactory {

    public int numOfGears;
    private final String steeringType;

    public HondaCarFactory(String steeringType, int numOfGears) {
        this.steeringType = steeringType;
        this.numOfGears = numOfGears;
    }

    @Override
    public MusicSystem getMusicSystem() {
        return new HondaMusic();
    }

    @Override
    public Steering getSteeringSystem() {
        return new HondaSteering(this.steeringType);
    }

    @Override
    public Transmission getTransmission() {
        return new HondaTransmission(this.numOfGears);
    }
}
