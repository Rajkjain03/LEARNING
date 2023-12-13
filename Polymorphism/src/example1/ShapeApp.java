package example1;

public class ShapeApp {

//	public static void main(String[] args) {
//	Shape sh ;
//	Square sq = new Square();
//	//up casting
//	sh = sq;
//	sh.draw();  //calling inherited method
//	System.out.println(sh.findArea()); //calling overriden method
//	System.out.println(((Square)(sh)).findSquarePerimeter()); // calling child specific method
//	
//	Circle c = new Circle();
//	//upcasting
//	sh = c;
//	sh.draw();
//	System.out.println(sh.findArea());
//	System.out.println(((Circle)(sh)).findCirclePerimeter());
//}

//		or

	public static void activity(Shape sh) {
		sh.draw();
		System.out.println(sh.findArea());
		if (sh instanceof Square) {
			System.out.println(((Square) (sh)).findSquarePerimeter());
		} else if (sh instanceof Circle) {
			System.out.println(((Circle) (sh)).findCirclePerimeter());
		}
	}

	public static void main(String[] args) {
		Shape sh;
		sh = new Square();
		activity(sh);
		sh = new Circle();
		activity(sh);

	}
}
