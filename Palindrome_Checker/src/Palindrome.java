
public class Palindrome {
	
	public int check(int n) {
		int rev = 0;
		while(n>0) {
			int ld = n%10;
			rev = ld+rev*10;
			n = n/10;
		}
		return rev;
	}

}
