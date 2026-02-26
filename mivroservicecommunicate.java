interface Service {
    void communicate();
}

class OrderService implements Service {
    public void communicate() {
        System.out.println("Order service communicating");
    }
}
class mivroservicecommunicate {
	public static void main(String[]args) {
		Service s=new OrderService();
		s.communicate();
	}
}
