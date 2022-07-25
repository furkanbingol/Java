public class BankTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Furkan");
        CreditCard cc1 = new CreditCard("1", 1000);
        cc1.setOwner(c1);
        c1.setCreditCard(cc1);

        //Another Method
        Customer c2 = new Customer(2, "James");
        CreditCard cc2 = new CreditCard("2", 2500, c2);

        System.out.println("Customer1's credit card's balance: " + c1.creditCard.balance);
        System.out.println("Customer2's credit card's balance: " + c2.creditCard.balance);
    }
}
