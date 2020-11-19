import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three digit number");
		int d = sc.nextInt();
		int rem  = d % 10;
		int quo = d / 100;
		System.out.println(rem == quo);
	}
}
