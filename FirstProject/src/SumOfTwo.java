import java.util.Scanner;

public class SumOfTwo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two digit value");
		int n = sc.nextInt();
		int rem = n%10;
		int quo = n/10;
		int sum = rem + quo;
		System.out.println("Sum is " +(Math.abs(sum)));
	}

}
