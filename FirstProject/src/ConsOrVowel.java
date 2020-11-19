import java.util.Scanner;

public class ConsOrVowel {

	static boolean isVowel(char ch)
	{
		boolean b = false;
		switch(ch) {
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :
				b = true;
		}
		return b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any char");
		char ch = sc.next().toUpperCase().charAt(0);
		if(Character.isLetter(ch)) {
			String res = " ";
			if(isVowel(ch)) {
				res = ch + " is vowel";	
			}
			else {
				res = ch + " is consonent";
			}
			System.out.println(res);
		}
		else {
			System.out.println("Invalid character");
		}
		
	}
}
