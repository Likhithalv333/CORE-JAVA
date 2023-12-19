package com.satya.collections;

import java.util.Comparator;

class AgeComp implements Comparator<Cricket>{
	@Override
	public int compare(Cricket c1, Cricket c2) {
		// TODO Auto-generated method stub
		return c1.getAge().compareTo(c2.getAge());
	}
	
}
