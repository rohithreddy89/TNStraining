package tns.oops;


interface a{
	void methodA();
}
interface b{
	void methodB();
}
public class MultipleInheritance implements a,b {

	public void methodA() {
		System.out.println("method A");
		}
	public void methodB() {
		System.out.println("method B");
	}
}
