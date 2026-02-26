interface APIhandler{
	void handlerequest();
}
class userAPI implements APIhandler {
	public void handlerequest() {
		System.out.println("using API handler");
}
}
class APIhandlerTest{
	public static void main(String []args) {
		APIhandler A=new userAPI();
		A.handlerequest();
	}
}

