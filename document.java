interface Document {
    void open();
}

class PDFDocument implements Document {
    public void open() {
        System.out.println("PDF opened");
    }
}
class DocumentMain{
	public static void main(String []args) {
		Document d=new PDFDocument();
		d.open();
}
}