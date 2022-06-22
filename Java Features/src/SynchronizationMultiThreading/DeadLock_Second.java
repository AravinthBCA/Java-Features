package SynchronizationMultiThreading;

public class DeadLock_Second {
	public synchronized void method1(DeadLock_First obj) {
		System.out.println("Inside Method1 of Second");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking Metho2 of First");
		obj.method2();
	}
	public synchronized void method2() {
		System.out.println("Inside Method2 of Second");
	}
}
