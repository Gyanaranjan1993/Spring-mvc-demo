package com.gyana.design.abstractfactory;

public class HondaSteering implements Steering {

    private final String SteeringType;

    public HondaSteering(String steeringType) {
        SteeringType = steeringType;
    }

    @Override
    public int getSteeringWheelRadius() {

        switch (this.SteeringType) {

            case "small":
                return 1;
            case "large":
                return 5;
            default:
                return 3;
        }
    }
}
