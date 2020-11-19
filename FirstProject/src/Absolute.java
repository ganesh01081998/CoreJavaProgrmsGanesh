import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int res =abs(sc.nextInt());
		System.out.println(res);
	}
	
	static int abs(int num) {
		
		if(num < 0)
		{
			num = -num;
		}
		return num;
	}
}
