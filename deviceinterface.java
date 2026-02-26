interface Device {
    void start();
}

class Mobile implements Device {
    public void start() {
        System.out.println("Mobile started");
    }
}
class deviceinterface{
	public static void main(String []args) {
		Device d=new  Mobile();
		d.start();
	}
}
