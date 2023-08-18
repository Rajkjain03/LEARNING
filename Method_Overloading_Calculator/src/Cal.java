
public class Cal {
	public void calculate(double a, double b, char c ) {
		
		switch(c) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;	
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;	
		default:
			System.out.println("Enter correct operator");	
		}
		
	}
	
public void calculate(double a,  char c, double b ) {
		
		switch(c) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;	
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;	
		default:
			System.out.println("Enter correct operator");	
		}
		
	}

public void calculate( char c,double a, double b ) {
	
	switch(c) {
	case '+':
		System.out.println(a+b);
		break;
	case '-':
		System.out.println(a-b);
		break;	
	case '*':
		System.out.println(a*b);
		break;
	case '/':
		System.out.println(a/b);
		break;	
	default:
		System.out.println("Enter correct operator");	
	}
	
}


	
}