package Vectors;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Sravanthi");
		v.add("Harsha");
		v.add(0, "Deven");
		v.add("Sharath");
		v.add("Sujatha");
		v.add("Sylendra");
		v.add("A1");
		v.add("A2");
		v.add("A3");
		v.add("A4");
		v.add("A5");
		v.add("Sravanthi");
		v.add(0, "Harsha");
		v.add("Sravanthi");
		
		
		System.out.println(v.size());//no of elements present in list
		System.out.println(v.capacity());//Array capacity
		
		
	}

}
