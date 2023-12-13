package MultithreadingJoinMethod;

public class Reel extends Thread{
	public void run() {
		try {
			System.out.println("Reel is crated");
			Thread.sleep(2000);
			System.out.println("Posting a reel");
			Thread.sleep(2000);
			System.out.println("reel is uploaded");
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
