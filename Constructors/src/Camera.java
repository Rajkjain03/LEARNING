
public class Camera {
	int cost;
	String brand;
	
	void captureImage() {
		System.out.println("Clicking...");
	}
	
	public Camera() {
		cost = 500;
		brand = "sony";
	}
	
	public Camera(int x, String y) {
		cost = x;
		brand = y;
	}
}
