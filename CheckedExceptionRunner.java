import java.util.Scanner;

public class CheckedExceptionRunner {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name =sc.nextLine();
		if(name.matches("[a-zA-Z]+")) {
			System.out.println("Name enterd by you is "+name);
		}
		else {
			throw new CustomCheckedException("Enter proper name");

		}
	}

}
