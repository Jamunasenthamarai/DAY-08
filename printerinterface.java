interface printer{
	void print();
}
class inkjetprinter implements printer{
	public void print() {
		System.out.println("printing using inkjetprinter");
	}
}
class printerinterface {
	public static void main(String []args) {
		printer p=new inkjetprinter ();
       p.print();
	}
}