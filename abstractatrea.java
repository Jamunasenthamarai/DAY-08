abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle calculated");
    }
}
class abstractatrea {
	public static void main(String []args) {
		Shape s=new Circle();
		s.area();
	}
}

