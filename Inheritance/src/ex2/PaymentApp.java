package ex2;

public class PaymentApp {
	public static void main(String[] args) {
//		Upi u = new Upi() ;
//		u.pay();
//		
//		Card c  = new Card();
//		c.pay();
		
		Payment p;
		p = new Upi();
		p.pay();
		
		p = new Card();
		p.pay();
		
	}
}
