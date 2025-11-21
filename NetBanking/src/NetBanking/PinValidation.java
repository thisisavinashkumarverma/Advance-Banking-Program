package NetBanking;
import java.util.Scanner;
public class PinValidation {
	public static void pinval(LoginCredential lc){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your PIN   :");
		int p=sc.nextInt();
		if(p==lc.pin){
			System.out.println("Correct PIN");
			}
		else{
			System.out.println("Invalid pin");
		}
	}

}
