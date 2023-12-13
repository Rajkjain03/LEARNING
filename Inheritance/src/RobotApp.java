
public class RobotApp {
	public static void main(String[] args) {
		Robot r = new Robot();
		r.charge();
		r.talk();
		r.walk();
		
		System.out.println("------------------");
		
		CheifRobot cr = new CheifRobot();
		cr.charge();
		cr.talk();
		cr.walk();
		cr.cook();
		
		System.out.println("------------------");
		
		DoctorRobot dr = new DoctorRobot();
		dr.charge();
		dr.talk();
		dr.walk();
		dr.surgery();
	}
}
