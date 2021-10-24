package com.gyana.design.abstractfactory;

public class NissanSteering implements Steering {

    private final String SteeringType;

    public NissanSteering(String steeringType) {
        SteeringType = steeringType;
    }

    @Override
    public int getSteeringWheelRadius() {

        switch (this.SteeringType) {

            case "small":
                return 3;
            case "large":
                return 4;
            default:
                return 9;
        }
    }
}
