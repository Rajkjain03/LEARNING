
public class LaptopApp {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("i5",4);
		Laptop l2 = new Laptop("ryzen-5" , 8);
		
		System.out.println("l1 : " + l1.getProcessorName()+ " " + l1.getMemorySize());
		System.out.println("l2 : " + l2.getProcessorName()+ " " + l2.getMemorySize());
	}
}
