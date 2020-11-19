

 
class A{
final int i=10;
 public int k=10;
	
	void math() {
		  int i=2;
		System.out.println(i);
	}
}
class hp extends A{
	void venkat(){
	 System.out.println(k);
}
}
class C{
	public static void main(String[] args) {
		A gh=new A();
		gh.math();
		hp hi=new hp();
		hi.venkat();
}
}