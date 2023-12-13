package MultithreadingProblem;

public class Addition extends Thread{
	int num1;
	int num2;
	
	public Addition(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void run(){
		try {
			System.out.println("Addition started");
			Thread.sleep(2000);
			System.out.println("Addition : " + (num1+num2));
			Thread.sleep(2000);
			System.out.println("Addition ended");
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
}
