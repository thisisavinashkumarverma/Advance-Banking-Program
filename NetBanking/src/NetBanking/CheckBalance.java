package NetBanking;

public class CheckBalance {
	public static void checkBal(LoginCredential lc){
		PinValidation.pinval( lc);
		System.out.println("Your Available Balance :"+ lc.balance);
		System.out.println("************************Thank you For Visiting Us************************");
		
		
	}
}

