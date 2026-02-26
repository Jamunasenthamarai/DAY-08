interface Authentication {
    boolean login(String user, String pass);
}

class UserAuth implements Authentication {
    public boolean login(String user, String pass) {
        return user.equals("admin") && pass.equals("1234");
    }
}
class authentication {
	public static void main(String[]args) {
		Authentication a=new UserAuth();
		boolean result = a.login("admin", "1234");  
        if (result) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
	}
}
