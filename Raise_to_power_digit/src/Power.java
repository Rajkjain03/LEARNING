
public class Power {
	
	public int numberOfDigit(int n) {
		int digit = 0;
		while(n>0) {
			n = n/10;
			digit++;
		}
		return digit;
	}
	public int power(int a, int digit) {
		int res = a;
		for(int i =2; i<=digit; i++) {
			res = res*a;
		}
		return res;
	}
	
	

}
