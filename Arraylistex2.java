package com.satya.collections;
import java.util.*;
public class Arraylistex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList objs=new ArrayList();
		objs.add(10);
		objs.add(10.5);
		objs.add('A');
		objs.add("ratan");
		System.out.println(objs.size());
		System.out.println(objs);
		Integer first = (Integer)objs.get(0);
		System.out.println(first);
		Character third=(Character) objs.get(2);
		System.out.println(third);
		String last = (String)objs.get(objs.size()-1);
		System.out.println(last);
	}

}
