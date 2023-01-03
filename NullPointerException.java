import java.util.Scanner;

public class NullPointerException {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 4 characters name to see null pointer Exception");
		String name =sc.nextLine();
		if(name.length()==4) {
			name=null;
			System.out.println("Name enterd by you is "+name.toLowerCase());
		}
		else {
			System.out.println("Name enterd by you is "+name.toLowerCase());
		}
	}

}
