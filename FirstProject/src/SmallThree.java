import java.util.Scanner;

public class SmallThree {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 values");
		System.out.println(findSmall(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}
	
	static String findSmall(int num1, int num2, int num3) {
		
		String res = " ";
		if(num1 < num2 && num1 < num3) {
			res = num1 + " is small";
		}
		else if(num2 < num3) {
			res = num2 + " is small";
		}
		else
		
			res = num3 + " is small";
		
		return res;
	}
	

}
