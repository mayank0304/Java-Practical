abstract class Payment {
    public abstract void makePayment(double amount);
    
    public void paymentDetails(double amount) {
        System.out.println("Payment of $" + amount + " is being processed.");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount);
    }
}
class PayPalPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing PayPal Payment of $" + amount);
    }
}

public class Abs {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment payPal = new PayPalPayment();
        
        creditCard.paymentDetails(100.50);
        creditCard.makePayment(100.50);   
        
        System.out.println(); 
        
        // Process PayPal payment
        payPal.paymentDetails(50.75);  
        payPal.makePayment(50.75);     
    }
}
