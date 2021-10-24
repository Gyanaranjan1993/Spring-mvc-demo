package com.gyana.design.abstractfactory;

public class FactoryProvider {

    public static CarFactory createFactory(String type, String steeringType, int numOfGears) {
        if (type.equalsIgnoreCase("honda"))
            return new HondaCarFactory(steeringType, numOfGears);

        else if (type.equalsIgnoreCase("nissan"))
            return new NissanCarFactory(steeringType, numOfGears);

        else
            throw new RuntimeException("The car factory you are requesting for is not built yet!");
    }

}
