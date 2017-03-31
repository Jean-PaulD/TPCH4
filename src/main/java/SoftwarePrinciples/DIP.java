package SoftwarePrinciples;

/**
 * Created by Jean-Paul D on 2017-03-31.
 */
public class DIP {

    public class BuyerImplementationCorrection implements Buyer{

        public double amount() {
            return 10.34;
        }
    }

    public interface Buyer{

        double amount();
    }

    public class Salesman{

        public  double getAmountPaid(Buyer buyer){
            return buyer    .amount();
        }
    }
}
