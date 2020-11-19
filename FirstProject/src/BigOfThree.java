import java.util.Scanner;

public class BigOfThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 values");
		System.out.println(findBig(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	    	
	}
	static String findBig(int num1,int num2,int num3) {
		String res = " ";
		if(num1 > num2 && num1 > num3) {
			res = num1 + "is big";
		}
		else if(num2 > num3) {
			res = num2 + "is big";
		}
		else {
			res = num3 + "is big";
		}
		return res;
		
	}
	
}
