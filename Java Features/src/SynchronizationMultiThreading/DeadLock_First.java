package SynchronizationMultiThreading;

public class DeadLock_First {
	public synchronized void method1(DeadLock_Second obj) {
		System.out.println("Inside Method1 of First");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking Method2 of Second");
		obj.method2();
	}
	public synchronized void method2() {
		System.out.println("Inside Method2 of First");
	}
}
