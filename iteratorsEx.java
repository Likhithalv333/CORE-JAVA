package com.sathya.cursors;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class iteratorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arraylist,hashset,vector
		//we can read the data from all classes
		//universal cursor
		//read,remove,forward cursor
		HashSet< String> sweets=new HashSet<String>();
		sweets.add("jilebi");
		sweets.add("gulabjam");
		sweets.add("laddu");
		sweets.add("palakova");
		sweets.add("sweet");
		sweets.add("laddu");
		Iterator< String> iteratore= sweets.iterator();
		while (iteratore.hasNext()) {
			String sweet =  iteratore.next();
			if(sweets.equals("laddu")) {
			iteratore.remove();
			}
			
		}
		System.out.println(sweets);
		}
		

	}


