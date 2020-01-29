
public class Main {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.display(rect.calculateArea(4, 5));
		
		Circle cir = new Circle();
		cir.display(cir.calculateArea(1.0F, 3.14F));
		
		Triangle tri = new Triangle();
		tri.display(tri.calculateArea(10, 2));
		
	}

}
