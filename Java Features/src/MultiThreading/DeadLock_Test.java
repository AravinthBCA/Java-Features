package MultiThreading;

public class DeadLock_Test implements Runnable{

	DeadLock_First fr = new DeadLock_First();
	DeadLock_Second se = new DeadLock_Second();
	
	public DeadLock_Test() {
		new Thread(this).start();
		se.method1(fr);
	}
	
	public static void main(String[] args) {
		new DeadLock_Test();
	}
	
	@Override
	public void run() {
		fr.method1(se);
	}
	

}
