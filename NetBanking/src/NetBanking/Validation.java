package NetBanking;

public class Validation {
	
	
	public static void validation(String username, String password,LoginCredential lc){
		AskIdPass aip=new AskIdPass();
		
		
		if(username.equals (lc.uname)){
			if(password.equals (lc.pass)){
				Services.services(lc);
				
			}
			else{
			System.out.println("invalid password");
				
			}
		}
		else{
			System.out.println("invalid username");
		}
		
	}

}
