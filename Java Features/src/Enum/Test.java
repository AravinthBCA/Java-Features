package Enum;

public class Test {
	public static void main(String[] args) {
		System.out.println(Database.MONGODB);
		Database[] types = Database.values();
		for (Database database : types) {
			System.out.println(database);
			System.out.println(database.ordinal());
		}
		System.out.println("-------------------------");
		PaymentType[] payment = PaymentType.values();
		for (PaymentType database : payment) {
			System.out.println(database);
			System.out.println(database.fee);
		}
	}
}
