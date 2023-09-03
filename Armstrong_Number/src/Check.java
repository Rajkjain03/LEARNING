
public class Check {
	public int armstrong(int n,int digit) {
		int sum = 0;
		while(n!=0) {
			int ld = n%10;
			sum = sum + power(ld,digit);
			n = n/10;
		}
		return sum;
	}
	
	public int dig(int n) {
		int count = 0; 
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
	}
	
	public int power(int n, int c) {
		int a = 1;
		for(int i = 1; i<=c ; i++) {
			a = a*n;
		}
		return a;
	}

}
