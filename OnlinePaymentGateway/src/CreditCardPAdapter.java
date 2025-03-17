class CreditCardPAdapter implements PaymentMethod{
    CreditCardPayment creditCardPayment;
    CreditCardConfirmer confirmer;
    String cardNum;

    public CreditCardPAdapter(String cardNum){
        this.creditCardPayment= new CreditCardPayment();
        this.confirmer= new CreditCardConfirmer();
        this.cardNum= cardNum;
    }
    public void processPayment(double amount){
        if(!confirmer.confirmCard(cardNum)){
            throw new IllegalArgumentException("WRONG CREDIT CARD NUMBER!");}     //if the digits of credit card is not 16, it throws exception
        creditCardPayment.processPayment(amount);
        System.out.println("succesful payment!");
    }}// heer we use adapter pattern, its like a bridge,
// makes sure that payment system can work with credit card validation system