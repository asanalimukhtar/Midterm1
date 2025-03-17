public class Transaction{
    String status;
    double amount;
    public Transaction(double amount){
        this.amount=amount;
        this.status="pending";
    }
    public void complete(){
        this.status="completed";
    }
    public void fail(){
        this.status="failed";
    }
    public String getStatus(){
        return status;
    }
}   //this class shows status of transaction as you see there are 3 of them
