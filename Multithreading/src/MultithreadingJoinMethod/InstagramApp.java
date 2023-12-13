package MultithreadingJoinMethod;

public class InstagramApp {
	public static void main(String[] args) {
		try {
			System.out.println("Instagram app opened");
			Chatting ch = new Chatting();
			Reel rl = new Reel();
			ch.start();
			rl.start();
			ch.join();
			rl.join();
			System.out.println("Instagram app closed");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
