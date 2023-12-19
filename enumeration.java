package com.sathya.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can read data from 1.0 classes,vector,hashtable
		//only read,hasMoreElement,nextElement,object-element()
		Vector<String> names=new Vector<String>();
		names.add("chilaka");
		names.add("molaka");
		names.add("pilaka");
		names.add("gilaka");
		names.add("milaka");
		names.add("rohit");
		Enumeration<String> enumaration=names.elements();
		while (enumaration.hasMoreElements()) {
			String element =  enumaration.nextElement();
			System.out.println("your name..."+element);
		}

	}

}
