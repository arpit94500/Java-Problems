
public class Thread2 extends Thread{
	public void run()
	{
		for(int i=10;i>0;i--)
		{
			System.out.println(i+"->"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException{

		Thread2 t1= new Thread2();
		Thread2 t2= new Thread2();
		Thread2 t3= new Thread2();
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t1.start();
		
		t2.start();
		t1.join();
		t3.start();
		}

}
