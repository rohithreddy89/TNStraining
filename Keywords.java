package tns.keywords;

public class Keywords {

	void methodA() {
		System.out.println("Parent Class");
	}
}

class child extends Keywords{
	void methodB() {
		super.methodA();
		System.out.println("Child Class");
	}
}

class demo extends Keywords{
	int x;
	
	demo(int x){
		this.x = x;
		System.out.println(x);
	}
}

final class parent extends Keywords{
	static void display() {
		System.out.println("Static method");
	}
}

/*
 * class maths extends parent{ void show() { System.out.println("Final"); } }
 */