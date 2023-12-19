package com.satya.collections;

import java.util.ArrayList;

public class countiesex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c=new ArrayList<String>();
		c.add("india");
		c.add("china");
		c.add("america");
		c.add("japan");
		c.add("russia");
		//update the counties
		c.set(c.indexOf("india"),"bharath");
		c.set(c.indexOf("america"), "us");
		System.out.println(c);
		
		//remove china based on index
		c.remove(1);
		c.remove(3);
		System.out.println(c);
		
		//print the data
				for(String cs:c) {
					System.out.print(cs+" ");
				}
	}

}
