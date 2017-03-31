package SoftwarePrinciples;

/**
 * Created by Jean-Paul D on 2017-03-31.
 */
public class ISP {

    public class BMWX5Impl implements BMWX5{
        public void carPurpose(){
            System.out.println(""+purpose);
        }
    }

    public class BMWM3GTRImpl implements BMWM3GTR{
        public void carPurpose(){
            System.out.println(""+purpose);
        }
    }

    public interface BMWM3GTR{
        String purpose = "racing";
    }

    public interface BMWX5{
        String purpose = "off roading";
    }
}
