public class JoinThreadExample {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Hello, World");
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("T1 thread running");
				try{
					Thread.sleep(2000);
					System.out.println("T1 woken");
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
				System.out.println("T1 thread completed");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("T2 thread running");
				try{
					Thread.sleep(2000);
					System.out.println("T2 woken");
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
				System.out.println("T2 thread completed");
			}
		});
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println("Main thread execution");
	}
	
}
