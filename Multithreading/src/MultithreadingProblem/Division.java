package MultithreadingProblem;

public class Division extends Thread{
	int num1;
	int num2;
	
	public Division(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void run(){
		try {
			System.out.println("Division started");
			Thread.sleep(2000);
			System.out.println("Division : " + (num1/num2));
			Thread.sleep(2000);
			System.out.println("Division ended");
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
}