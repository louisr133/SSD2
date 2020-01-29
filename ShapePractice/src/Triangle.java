
public class Triangle implements Shape{

	@Override
	public float calculateArea(float length, float height) {
		return 1.0f / 2.0f * length*height;
	}

	@Override
	public void display(float area) {
		System.out.println("Area is: " + area);
		
	}
	
}
