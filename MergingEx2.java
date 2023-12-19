package com.satya.collections;

import java.util.ArrayList;

public class MergingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> enos=new ArrayList<Integer>();
		enos.add(16);
		enos.add(90);
		enos.add(678);
		enos.add(64);
		ArrayList<Integer> onos=new ArrayList<Integer>();
		onos.add(19);
		onos.add(97);
		onos.add(673);
		onos.add(67);
		ArrayList<Integer> pnos=new ArrayList<Integer>();
		pnos.add(19);
		pnos.add(93);
		pnos.add(2);
		pnos.add(5);
		ArrayList<Integer> Anos=new ArrayList<Integer>();
		Anos.addAll(enos);
		Anos.addAll(onos);
		Anos.addAll(pnos);
		Anos.add(1000);
		System.out.println(Anos);
		System.out.println(Anos.contains(17));
		System.out.println(Anos.containsAll(enos));
		Anos.remove(Anos.indexOf(16));
		System.out.println(Anos);
		System.out.println(Anos.contains(enos));
		Anos.retainAll(pnos);
		System.out.println(Anos);
		
		
	}

}
