package com.satya.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ordered
		Set<String> weeknames=new LinkedHashSet<String>();
		weeknames.add("mon");
		weeknames.add("tue");
		weeknames.add("wed");
		weeknames.add("thu");
		weeknames.add("sat");
		for(String days:weeknames) {
			System.out.println(days);
		}
		

	}

}
