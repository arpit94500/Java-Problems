
public class Thread1 extends Thread {

	public static void main(String[] args) {
		Thread1 t= new Thread1();
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getState());
		System.out.println(t.getPriority());
		System.out.println(t.isAlive());
		t.setName("Arpit");
		t.setPriority(1);
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getState());
		System.out.println(t.getPriority());
		System.out.println(t.isAlive());
		

	}

}
