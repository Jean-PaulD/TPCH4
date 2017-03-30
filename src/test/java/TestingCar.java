import car.Car;
import carType.HatchBack;
import carType.SUV;
import carType.Sedan;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jean-Paul D on 2017-03-30.
 */
public class TestingCar {

    //Testing Inheritance
    @Test
    public void testCarInheritance(){
        HatchBack h = new HatchBack();
        System.out.println("Inside inheritance test");
        assertEquals("Number of wheels should be 4 on every type of car", 4, h.getNumberOfWheels());
    }

    //Testing polymorphism
    @Test
    public void testCarpolymorphism(){
        Sedan s = new Sedan();
        //SUV suv = new SUV();
        Car c = s;

       assertEquals("cars main feature is wrong", "Has 4 doors", c.mainFeature());
    }

}



