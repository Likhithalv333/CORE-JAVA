package com.satya.collections;

import java.util.Vector;

public class vectorex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//same as arraylist but it is for thread safe, if we need thread safe go for vector,1.0 v synchronous
		Vector<Integer> numbers=new Vector<Integer>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		System.out.println("first element:"+numbers.get(0));
		numbers.set(1, 20);
		numbers.remove(2);
		for(Integer n:numbers) {
			System.out.println(n+" ");
		}
		System.out.println(numbers.size());
		System.out.println("is vectore empty.."+numbers.isEmpty());
		System.out.println("index of 20"+numbers.indexOf(20));
	}

}
