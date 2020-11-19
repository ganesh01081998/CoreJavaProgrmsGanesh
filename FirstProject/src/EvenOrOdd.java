import java.util.Scanner;

public class EvenOrOdd {

	static boolean findEven(int num) {
		
		boolean b = false;
		if(num %2 == 0)
		{
			b = true;
		}
		return b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		System.out.println(findEven(sc.nextInt()));
		
	}
}
