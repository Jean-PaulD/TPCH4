package carType;

import car.Car;

/**
 * Created by Jean-Paul D on 2017-03-29.
 */
public class Sedan extends Car {
    
    private static boolean boot = true;

    public boolean isBoot() {
        return boot;
    }

    public String mainFeature(){

        return "Has 4 doors";
    }
}
