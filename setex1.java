package com.satya.collections;

import java.util.HashSet;
import java.util.Set;

public class setex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//un-ordered
		Set<String> popularcities=new HashSet<String>();
		popularcities.add("londan");
		popularcities.add("india");
		popularcities.add("chinna");
		popularcities.add("paris");
		popularcities.add("dubai");
		for(String p:popularcities) {
			System.out.print(p+" ");
		}

	}

}
