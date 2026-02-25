interface shoppingcart {
    void additem(String item);
}

class cart implements shoppingcart {
    public void additem(String item) {
        System.out.println(item + " added to cart");
    }
}
class shoppingcartmain {
	public static void main(String[]args) {
		shoppingcart s=new cart();
		s.additem("Laptop");
	}
}
