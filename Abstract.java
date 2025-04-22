package tns.oops;

abstract class Abstract {

	abstract void run();
}

class walk extends Abstract{
	void run() {
		System.out.println("running");
	}
}
