package com.satya.collections;

import java.util.Stack;

public class stackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it follows fast in first out,push,pop,it is a child cls of vector
		Stack< String> names=new Stack<String>();
		names.push("likki");
		names.push("anu");
		names.push("sathya");
		names.push("teju");
		names.push("mouni");
		names.push("hasini");
		System.out.println(names);
		System.out.println(names.size());
		names.pop();
		System.out.println(names);
		System.out.println(names.search("teju"));
		System.out.println(names.peek());
		System.out.println(names.isEmpty());
		names.clear();
		System.out.println(names);
		
		

	}

}
