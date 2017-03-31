package SoftwarePrinciples;

/**
 * Created by Jean-Paul D on 2017-03-31.
 */
public class PLK {

    public class CallNewClass {
        public void newMethod(){
            SalesmanPLKImpl seller = new SalesmanPLKImpl();

           // seller.oldClass();

        }

    }

    public interface NewClassService {
        String oldClass();

    }

    public class SalesmanPLKImpl implements SalesmanPLK {

        NewClassService newClass;
        public String sellProduct() {
            return null;

        }

        public String itemName() {
            return null;

        }

        public double carprice() {
            return 0;

        }

        //public double sellcarpPrice() {
           // return 123.4;

        }
/*
        public double buyCar() {
            return 123.4;

        }
*/
        public String oldClass() {
            return "old class";

        }


    public interface SalesmanPLK{

        abstract String itemName();
        abstract double carprice();
       // abstract double sellcarpPrice();
       // abstract double buyCar();
    }


}
