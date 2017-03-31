package SoftwarePrinciples;

/**
 * Created by Jean-Paul D on 2017-03-31.
 */
public class OpenClosedPrincipleViolate {

    public void buyCar(String paymentMethod){
        if (paymentMethod == "Credit")
            System.out.println("You used credit card");
        else if (paymentMethod == "Cash")
            System.out.println("You paid cash");

    }

}
