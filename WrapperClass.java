package tns.wrapperclass;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String args[]) {
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(10);
		//ar.add("rohith");
		ar.add(20);
		ar.add(30);
		
		for (Object item : ar) {
			System.out.println(item);
		}
	}
}
