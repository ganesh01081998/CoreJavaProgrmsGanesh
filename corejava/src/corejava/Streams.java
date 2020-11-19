package corejava;
import java.util.ArrayList;
import java.util.List;

class Employee{
	private int eid;
	private int ename;
	private double salary;
	
	
	
	
	public int getEid() {
		return eid;
	}
	public int getEname() {
		return ename;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
}

public class Streams {

	public static void main(String[] args) {
       
		ArrayList<Employee> ar = new ArrayList<>();
		ar.add(new Employee(19354,"Nageswar" 100000));
  
	}

}
