package com.satya.collections;

import java.util.ArrayList;

public class Mergingex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> familyfrnds=new ArrayList<String>();
		familyfrnds.add("likhitha");
		familyfrnds.add("ramu");
		familyfrnds.add("lavan");
		familyfrnds.add("vamsi");
		familyfrnds.add("srinu");
		
		ArrayList<String> frnds=new ArrayList<String>(familyfrnds);
		frnds.add("saii");
		frnds.add("sasii");
		frnds.add("teju");
		
		System.out.println(frnds);
	}

}
