package SoftwarePrinciples;

import javax.swing.*;

/**
 * Created by Jean-Paul D on 2017-03-31.
 */
public class SRP {


    public class BuyingCar{
        String paymentMethod;

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            purchaseMessage(this.paymentMethod);
        }

        public void purchaseMessage(String paymentMethod){
            if (paymentMethod == "Cash")
                JOptionPane.showMessageDialog(null, "You are paying with cash");
                //System.out.println("You are paying with cash");
            else if (paymentMethod == "Credit")
                JOptionPane.showMessageDialog(null, "You are paying with creditcard");
            else if (paymentMethod == "loan")
                JOptionPane.showMessageDialog(null, "You made a loan");
        }
    }

    public class BuyingCarImpl extends BuyingCar{

        public void buyCar(String paymentMethod){
            setPaymentMethod(paymentMethod);
        }

    }
}
