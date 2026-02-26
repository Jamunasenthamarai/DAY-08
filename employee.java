interface EmployeeRole {
    void role();
}

class Manager implements EmployeeRole {
    public void role() {
        System.out.println("Manager handles team");
    }
}
class employee {
	public static void main(String []args) {
		EmployeeRole e=new Manager();
		e.role();
	}
}
