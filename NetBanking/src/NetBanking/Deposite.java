package NetBanking;
import java.util.Scanner;
public class Deposite {
public static double depositeAm(double balance){
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Depositing Amount");
		Double dp=sc.nextDouble();
		balance=balance+dp;
		System.out.println("Available Balance :"+ balance);
		
		System.out.println("************************Thank you For Visiting Us************************");
		return balance;
		
	}

}
