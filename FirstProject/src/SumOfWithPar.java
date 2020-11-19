import java.util.Scanner;

public class SumOfWithPar {

	public static void main(String[] args) {
		
		// Without return-type, with parameters
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		sum(sc.nextInt(),sc.nextInt());
	}
	static void sum(int a, int b)
	{
		System.out.println("Sum = " + (a + b));
	}
} 
