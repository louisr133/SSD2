
public class Rectangle implements Shape {

	@Override
	public float calculateArea(float length, float width) {
		return length * width;
	}

	@Override
	public void display(float area) {
		System.out.println("Area is: " + area);
		
	}
	
	

}
