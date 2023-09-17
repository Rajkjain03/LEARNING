
public class CameraApp {

	public static void main(String[] args) {
		Camera c1 = new Camera();
		System.out.println(c1.cost);
		
		Camera c2 = new Camera(5200,"cannon");
		System.out.println(c2.cost);
	}

}
