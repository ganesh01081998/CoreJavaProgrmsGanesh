import java.util.Scanner;

public class BiggestTwoVal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values");
		System.out.println("Biggest value = " + findBig(sc.nextInt(),sc.nextInt()));
		
	}
	// if else
	static int findBig(int num1, int num2)
	{
		
		int res = 0;
		if(num1 > num2)
		{
			res = num1;
		}
		else {
			res = num2;
		}
		return res;
	}
}
