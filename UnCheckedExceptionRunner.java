import java.util.Scanner;

public class UnCheckedExceptionRunner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name =sc.nextLine();
		if(name.matches("[a-zA-Z]+")) {
			System.out.println("Name enterd by you is "+name);
		}
		else {
			throw new CustomUnCheckedException("Enter proper name");

		}
	}

}
