package SoftwarePrinciples;

/**
 * Created by Jean-Paul D on 2017-03-31.
 */
public class DIPViolate {

    public class Buyer{

        double getAmount() {
            return 100;
        }

    }

    public class Student {

        private  double amount = new Buyer().getAmount();
        public  double getAmountPaid(){
            return amount;
        }
    }


}
