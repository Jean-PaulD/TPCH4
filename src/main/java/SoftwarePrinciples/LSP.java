package SoftwarePrinciples;

/**
 * Created by Jean-Paul D on 2017-03-31.
 */
public class LSP {

    public interface BMW{
        public int numberOfWheels = 4;
        public void series(String modelSeries);
    }

    public class BMWImpl implements BMW{

        public void series(String modelNumber) {

        }

        public String getNumberOfWheels(){
            return "all cars have " + numberOfWheels + " Wheels";
        }
    }
}
