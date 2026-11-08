
public class A {
 
	int i;
	private String name;
	void show() {
		System.out.println("A is shown")
;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 A a = new A();
 a.i = 2;
 a.name = "John";
 
 System.out.println("The value of i is"+a.i);
 System.out.println("The name is" +a.name);
 
 a.show();
	}

}
