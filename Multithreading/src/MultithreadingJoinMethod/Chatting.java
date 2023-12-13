package MultithreadingJoinMethod;

public class Chatting extends Thread{
	public void run() {
		try {
			System.out.println("Chatting started");
			Thread.sleep(2000);
			System.out.println("chatting happening");
			Thread.sleep(2000);
			System.out.println("chatting ended");
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
