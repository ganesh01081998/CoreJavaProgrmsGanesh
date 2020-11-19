import java.util.Scanner;

public class DiffOfNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two digit value");
		int n = sc.nextInt();
		int rem = n%10;
		int quo = n/10;
		int diff = rem-quo;
		int res = Math.abs(diff);
		System.out.println("Difference is " +res);
		
	}

}
