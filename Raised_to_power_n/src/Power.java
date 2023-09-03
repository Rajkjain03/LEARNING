
public class Power {
	public void power(int num, int n) {
		int res = 1;
		for(int i =1; i<=n; i++) {
			res = res*num;
		}
		System.out.println(res);
	}
}
