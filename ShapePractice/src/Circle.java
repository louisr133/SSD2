
public class Circle implements Shape {

	@Override
	public float calculateArea(float radius, float pi) {
		return pi*radius*radius;
	}

	@Override
	public void display(float area) {
		System.out.println("Area is: " + area);
		
	}
	
}
