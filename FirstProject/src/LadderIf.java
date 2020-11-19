import java.util.Scanner;

public class LadderIf {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values");
		System.out.println(findBig(sc.nextInt(),sc.nextInt()));
		
	}
	//Biggest of two numbers
	static String findBig(int num1, int num2)
	{
		
		String res = "";
		if(num1 > num2)
		{
			res = num1 +" is big";
		}
		else if(num2 > num1){
			res = num2 +" is big";
		}
		else {
			res = "both are same";
		}
		return res;
		
	}
}
