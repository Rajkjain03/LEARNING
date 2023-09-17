//Methods Which would accept parameters and would return value
public class Type4 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int sum = add(x,y);
		System.out.println(sum);
		
//		or
		
		System.out.println(add(x,y));
		
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	

}

