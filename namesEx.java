package com.satya.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class namesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<String>();

		names.add("ratan");
		names.add("sathya");
		names.add("chandu");
		names.add("anu");
		names.add("raju");
		names.add("rani");
		System.out.println(names.size());
		for(String name:names)
		{
			if(name.startsWith("r")) {
				System.out.println(name);
			}
			
		}
		System.out.println("*****");
		for(String name:names)
		{
			if(name.endsWith("a")) {
				System.out.println(name);
			}
			
		}
		System.out.println("************88");
		for(String name:names)
		{
			
							System.out.print(name.length()+" ");
			
			
		}
		System.out.println("*************");
		
		names.remove("raju");
		names.set(names.indexOf("sathya"), "sathyatech");
		System.out.println(names);
		int index=names.indexOf("raju");
		System.out.println("raju index"+index);
		boolean ispresent=names.contains("sathya");
		System.out.println(ispresent);
		
		
	}

}
