package com.satya.collections;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	public static void main(String[] args) {
		List<String> company=List.of("google","tcs","infosy","amzon","oracle","sathtech");
		System.out.println(company.get(0));
		System.out.println(company.get(company.size()-1));
		System.out.println(company.get(2));
		System.out.println("*******");
		for(int i=0;i<3;i++) {
			System.out.println(company.get(i));
		}
		System.out.println("**************");
		for(String c:company) {
			System.out.println(c);
		}
		
	}
	

}
