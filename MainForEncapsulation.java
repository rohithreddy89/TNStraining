package tns.oops;

public class MainForEncapsulation {

		public static void main(String args[]) {
			Encapsulation emp = new Encapsulation();
			
			emp.setSalary(45);
			emp.setName("rohith");
			
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
}
