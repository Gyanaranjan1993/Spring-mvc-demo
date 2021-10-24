package com.gyana.design.abstractfactory;

public interface CarFactory {
    MusicSystem getMusicSystem();

    Steering getSteeringSystem();

    Transmission getTransmission();
}
