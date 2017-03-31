package SoftwarePrinciples;

/**
 * Created by Jean-Paul D on 2017-03-31.
 */
public class ISPViolate {

    public class BMWX5Impl implements BMW{
        public void carPurpose(){
            System.out.println(""+purpose);
        }
    }

    public class BMWM3GTRImpl implements BMW{
        public void carPurpose(){
            System.out.println(""+purpose);
        }
    }

    public interface BMW{
        String purpose = "off roading";
    }
}
