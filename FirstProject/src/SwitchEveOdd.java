import java.util.Scanner;

public class SwitchEveOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		System.out.println(isEven(sc.nextInt()));
	}
	static String isEven(int num) {
		
		String res =" ";
		switch(num % 2) {
		
		    case 0 :
		    	res = num +"is even";
		    	break;
		    case 1 :
		    	res = num +"is odd";
		    	break;
		}
		return res;
	}
}
