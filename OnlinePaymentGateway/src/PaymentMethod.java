// Interface for all payment methods
interface PaymentMethod {
    void processPayment(double amount);
}
// this class for credit card payment
class CreditCardPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("credit card payment of "+amount+" is in process");
    }
}
// this class for PayPal payment
class PayPalPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("paypal payment of "+amount+" is in ptocess");
    }
}
// this class for cryptocurrency payment
class CryptoPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("crypto payment of "+amount+" is in process");
    }
}
// Checks the correctness of the credit card number (API mockup)
class CreditCardConfirmer {
    public boolean confirmCard(String cardNumber) {
        return cardNumber.length() == 16; //checks if credit number is correct and contain 16 digits
    }
}
// all the paymont methods implements this interface