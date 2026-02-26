interface report {
    void generate();
}

class pdfreport implements report {
    public void generate() {
        System.out.println("PDF Report generated");
    }
}
class Main{
	public static void main(String []args) {
		report r=new pdfreport();
		r.generate();
	}
}