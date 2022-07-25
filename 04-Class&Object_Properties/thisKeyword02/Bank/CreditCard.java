public class CreditCard {
    String no;
    double balance;
    Customer owner;

    public CreditCard(String no, double balance) {  //constructor
        this.no = no;
        this.balance = balance;
    }

    public CreditCard(String no, double balance, Customer owner) {   //constructor
        this.no = no;
        this.balance = balance;
        this.owner = owner;
        owner.setCreditCard(this);   //O anki kredi kartını, owner'a setle(this sayesinde)
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
