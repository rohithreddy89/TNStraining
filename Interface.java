package tns.oops;

interface Interface{
	void sound();
}
class dog implements Interface{
	public void sound() {
		System.out.println("Dog");
	}
}
