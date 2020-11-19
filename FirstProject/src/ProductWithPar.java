import java.util.Scanner;

public class ProductWithPar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int res = product(sc.nextInt(),sc.nextInt());
		System.out.println("Product = " +res);
	}
	static int product(int num1, int num2) 
	{
		return num1*num2;
		
	}
}
