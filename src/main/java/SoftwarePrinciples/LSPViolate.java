package SoftwarePrinciples;

/**
 * Created by Jean-Paul D on 2017-03-31.
 */
public class LSPViolate {

    public interface Car1{
        public int numberOfWheels = 4;
        public void series(String modelSeries);
    }

    public class BMWImpl implements Car1{

        public void series(String modelNumber) {

        }

        public String getNumberOfWheels(){
            return "all cars have " + numberOfWheels + " Wheels";
        }
    }
}
