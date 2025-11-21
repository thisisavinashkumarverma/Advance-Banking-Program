package NetBanking;

public class Login {

	public static void main(String[] args) {
		LoginCredential lc=new LoginCredential("Avinash", "Avi@123",4254,1000000);
		
		AskIdPass.ask_id_pass(lc);
		

	}
	

}
