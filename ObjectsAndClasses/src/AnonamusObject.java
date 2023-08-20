//to access one behaviour of an object only once then we create anonamus object(object without reference)
public class AnonamusObject {
	
	String brand;
	int cost;
	
	void allowToDrivr() {
		System.out.println("car is moving");
	}
	
	void allowToRace() {
		System.out.println("Racing....");
	}

	public static void main(String[] args) {
		new AnonamusObject().allowToDrivr();
		new AnonamusObject().allowToRace();
	}

}
