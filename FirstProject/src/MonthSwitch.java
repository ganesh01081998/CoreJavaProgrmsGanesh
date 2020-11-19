import java.util.Scanner;

public class MonthSwitch {
     
    static String daysInMonth(String mName) {
    	
    	String res = " ";
    	switch(mName) {
    	
    	case "JAN" :
    	case "MAR" :
    	case "MAY" :
    	case "JUL" :
    	case "AUG" :
    	case "OCT" :
    	case "DEC" :
    		res = mName + " month has 31 days only";
    		break;
    	
    	case "APR" :
    	case "JUN" :
    	case "SEP" :
    	case "NOV" :
    		res = mName + "month has 30 days only";
    		break;
    	case "FEB" :
    		res = mName + " month has 28 days only";
    	
    	}
		return res;
    }
    
    public static void main(String[] args) {
		
   	 Scanner sc = new Scanner(System.in);
   	 System.out.println("Enter Month Name(3 chars)");
   	 String mName = sc.next();
   	 System.out.println(daysInMonth(mName));
	}
    
    
}
