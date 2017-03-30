package car;

/**
 * Created by Jean-Paul D on 2017-03-29.
 */

public abstract class Car {

    private String brandName;
    private String colour;
    private int year;
    private static int numberOfWheels = 4;

    public static int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        Car.numberOfWheels = numberOfWheels;
    }

    public String getBrandName() {
        return brandName;

    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String mainFeature(){

        return "A car has four wheels";
    }
}
