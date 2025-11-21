package NetBanking;
import java.util.Scanner;
public class Services {
	public static void services(LoginCredential lc){
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our Bank");
		System.out.println("You Logged In Successfully");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposite");
		System.out.println("3. Check balance");
		System.out.println("4. Exit");
		System.out.println("Enter Your selection :");
		int select=sc.nextInt();
		SelectedOption.selected_option(select,lc);
	}
		

}
