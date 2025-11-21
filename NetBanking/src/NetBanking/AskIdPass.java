package NetBanking;

import java.util.Scanner;

public class AskIdPass {
	
public static  void ask_id_pass(LoginCredential lc){
	Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter Your Username");
		String username=scanner.next();
		System.out.println("Enter Your Password");
		String password=scanner.next();
		
		Validation.validation(username,password, lc);
		
}
}