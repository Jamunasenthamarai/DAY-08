abstract class Loan {
    abstract void calculateInterest();
    void approve() {
        System.out.println("Loan Approved");
    }
}
class HomeLoan extends Loan {
    void calculateInterest() {
        System.out.println("Home loan interest calculated");
    }
}
class loanabstract{
	public static void main(String []args) {
		Loan h=new HomeLoan();
		h.approve();
	}
}