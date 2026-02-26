interface cloudstorage{
	void upload();
}
class googledrive implements cloudstorage {
	public void upload() {
		System.out.println("Upload successfully");
	}
}
class cloudstorageTest{
	public static void main(String []args) {
		cloudstorage c=new googledrive();
		c.upload();
	}
}
