import java.util.Scanner;

public class SwapWithTemp {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a and b values");
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Before swapping a = " +a +", b = " +b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping a = " +a +", b= " +b);
		
	}

}
