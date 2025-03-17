public class PaymentFactory{
    public static PaymentMethod createPayment(String type){
        if (type.toLowerCase().equals("cc")) {
            return new CreditCardPayment();
        } else if (type.toLowerCase().equals("pp")) {
            return new PayPalPayment();
        } else if (type.toLowerCase().equals("cr")) {
            return new CryptoPayment();
        } else {
            throw new IllegalArgumentException("WRONG PAYMENT TYPE");
        }
        //if input will not be these 3 types then it throws exception

    }
}// here we use factory pattern to create payment methods,
// its also flexible and convinient especially if you deside to add new payment method