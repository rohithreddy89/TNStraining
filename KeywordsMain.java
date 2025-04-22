package tns.keywords;

public class KeywordsMain {

	public static void main(String args[]) {
		child c = new child();
		c.methodB();//super
		
		//demo d = new demo(5);//this
		
		parent.display();//static
		
		String s = "Rohith";
		System.out.println(s instanceof String);//InstanceOf
		
		final int abc = 20;
		//abc = 25;
		System.out.println(abc);//Final
	}
}
