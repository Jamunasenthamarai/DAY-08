interface PaymentGateway {
    void pay(double amount);
}
class CreditCardGateway implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
class UPIGateway implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
class paymentsystem {
    public static void main(String[] args) {
        PaymentGateway p;

        p = new CreditCardGateway();
        p.pay(1000);

        p = new UPIGateway();
        p.pay(500);
    }
}