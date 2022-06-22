package ExceptionHandling;

public class ThowKeyword {

	public static void main(String[] args) throws UnCheckedCustomException, CheckedCustomException{
//		throw new RuntimeException("Funds not Available"); // default exception
//		throw new UnCheckedCustomException("UnCheckedCustom Exception"); // unchecked customer exception
		throw new CheckedCustomException("CheckedCustom Exception"); // checked customer exception
	}
}
