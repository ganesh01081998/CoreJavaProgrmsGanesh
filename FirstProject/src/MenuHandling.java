
public class MenuHandling {

	static void menu() {
		
		String m = "Menu Driven Application\n";
		       m += "1.Addition\n";
		       m += "2.Subtraction\n";
		       m += "3.Multiplication\n";
		       m += "4.Division\n";
		       m += "5.Exit\n";
		       m += "Select any option\n";
		       System.out.println(m);
	}
	static void accept() {
		System.out.println("Enter two values");
	}
	static int sum(int a,int b) {
		return a+b;
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static int div(int a, int b) {
		return a+b;
	}
}
