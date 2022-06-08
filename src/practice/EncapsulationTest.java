package practice;

public class EncapsulationTest {

	public static void main(String[] args) {
		UserLogin e = new UserLogin(5,"Amrita","QA") ;
		e.loginTest();
		
		UserLogin login = new UserLogin() ;
		login.loginTest();
	}
}

class UserLogin{
	
	//Declaration
	private int id = 1;
	private String name = "AD";
	private String role = "Dev";
	
	UserLogin(){
		
	}
	
	//Initialization
	UserLogin(int id, String name, String role){
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	//Utilization
	public void loginTest() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(role);
	}
}
