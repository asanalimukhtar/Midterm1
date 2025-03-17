import java.util.Scanner;

// Main class to run the payment system
public class PaymentMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your payment method (cc, pp, cr): "); //you must write one of the 3 methods in shorten form
        String method = in.nextLine();
        PaymentMethod paymentMethod;
        // If the user selects 'cc', ask for credit card number
        if (method.equals("cc")) {
            System.out.println("Type here card number: ");
            String cardNum = in.nextLine();
            paymentMethod = new CreditCardPAdapter(cardNum);  // Use the Adapter pattern for credit card payment
        } else {
            paymentMethod = PaymentFactory.createPayment(method);  //use factory pattern to create other methods if u wanna add more
        }
        System.out.println("Type here amount of money: "); // Ask the user to enter the payment amount
        double amount = in.nextDouble();
        Transaction transaction = new Transaction(amount);  // Create a Transaction object to track the payment status
        try {
            paymentMethod.processPayment(amount);  // Process the payment
            transaction.complete();  //if everything works correct it shows this status
        } catch (Exception e) {
            transaction.fail();   //if there is a problem, catch will show this status
        }
        // Display the final transaction status
        System.out.println("Transaction status is " + transaction.getStatus());
    }
}