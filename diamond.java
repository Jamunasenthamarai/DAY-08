interface A{
	default void show() {
		System.out.println("A is printing");
	}
}
interface B{
	default void show() {
		System.out.println("B is printing");
	}
}
class C implements A, B{
	public void show() {
		A.super.show();
	}
}
class diamond {
	public static void main(String []args) {
		C obj=new C();
	    obj.show();
	}
}
