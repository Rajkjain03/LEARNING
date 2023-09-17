
public class LabeledFor {

	public static void main(String[] args) {
		a: for(int i =1; i<=5; i++) {
			b: for(int j = 1; j<=5; j++) {
				System.out.print("* ");
				break a;
			}
			System.out.println();
		}
	}

}
