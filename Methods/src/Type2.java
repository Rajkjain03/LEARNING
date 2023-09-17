//Methods Which would not accept any parameters and would return any value
public class Type2 {
	public static void main(String[] args) {
		int sum = add();
		System.out.println(sum);
//		         or
//		System.out.println(add());
	}
	
	public static int add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}

}
