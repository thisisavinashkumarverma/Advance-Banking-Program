package NetBanking;
import java.util.Scanner;
public class SelectedOption {


public static void selected_option(int select,LoginCredential lc){
		
	Scanner sc=new Scanner(System.in);
		if(select==1){
			System.out.println("Withdraw Here  :");
			PinValidation.pinval(lc);
			System.out.println("Enter Your Withdrawl Amount  :");
			double amount= sc.nextDouble();
		
			
			if(lc.balance>=amount){
				lc.balance=lc.balance-amount;
			System.out.println("Withdrawal Successfull");
			System.out.println("Your Available Balance :"+ lc.balance);
		System.out.println("************************Thank you For Visiting Us************************");
		System.out.println("LOGIN HERE TO ACCESS MORE SERVICES");
		AskIdPass.ask_id_pass(lc);

			
				
			}
			else{
			System.out.println("Insufficient Balance");
				
			}
		
						
			
		}
		else{
			if(select==2){
				double bal=Deposite.depositeAm(lc.balance);
				lc.balance=bal;
				System.out.println("************************Thank you For Visiting Us************************");
				System.out.println("LOGIN HERE TO ACCESS MORE SERVICES");
				AskIdPass.ask_id_pass(lc);
				

				
				
			}
		else{
			if(select==3){
				CheckBalance.checkBal(lc);
				System.out.println("************************Thank you For Visiting Us************************");
				System.out.println("LOGIN HERE TO ACCESS MORE SERVICES");
				AskIdPass.ask_id_pass(lc);
				
			}
			else{
				if(select==4){
					Exit.exit();
					System.out.println("************************Thank you For Visiting Us************************");
					System.out.println("LOGIN HERE TO ACCESS MORE SERVICES");
					AskIdPass.ask_id_pass(lc);
				}
			else{
		System.out.println("invalid input");
				
			}
			}
		}
		}
		
	}

}
