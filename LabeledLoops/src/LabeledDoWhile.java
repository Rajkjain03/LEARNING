
public class LabeledDoWhile {

	public static void main(String[] args) {
		int j =1;
		a:do {
		int i =1;
		b:do {
			System.out.print("* ");
			i++;
//			break a;
		}while(i<=5);
		
		System.out.println();
		j++;
		}while(j<=5);

	}

}
