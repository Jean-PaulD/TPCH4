package carType;

import car.Car;
import carParts.Engine;

/**
 * Created by Jean-Paul D on 2017-03-31.
 */
public class Coupe {

    private Engine engine;

    public String carType(){
        return "This is a coupe";
    }



    public Coupe(int numberOfCylinders, String power, String torque){
        this.engine = new Engine();
        engine.setNumberOfCylinders(numberOfCylinders);
        engine.setPower(power);
        engine.setTorque(torque);
    }

    public Engine engineSpecs(){
        return this.engine;

    }

}
