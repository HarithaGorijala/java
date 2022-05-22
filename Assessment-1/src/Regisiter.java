import java.util.Scanner;

class Register1{
	String customerName;
	long pno1;
	long pno2;
	void authentication() {
		String passport="",user,pancardNo="",voterId="",licenseNo="";
		Scanner sc=new Scanner(System.in);
		System.out.println("provide the proofs:");
		user=sc.nextLine();
		if(user == passport) {
			System.out.println("provide the internet service");
		}
		 if(user == licenseNo) {
			if(user == pancardNo) {
				System.out.println("provide the service");
			}
		}
		 if(user == voterId) {
			if(user == pancardNo) {
				System.out.println("provide the service");
			}
		}  
		else {
			System.out.println("user not provide the details");
		}
		
	}
}
public class Regisiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register1 r = new Register1();
		r.authentication();
		

	}

}
