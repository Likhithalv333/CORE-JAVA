package com.satya.collections;

import java.util.ArrayList;

public class ArrayListex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		p1.setProId(1009);
		p1.setProName("oil");
		p1.setProPrice(678.90);
		Product p2=new Product();
		p2.setProId(10067);
		p2.setProName("soap");
		p2.setProPrice(68.90);
		Product p3=new Product();
		p3.setProId(1786);
		p3.setProName("shompoo");
		p3.setProPrice(675.90);
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		Product p=products.get(0);
		System.out.println(p.getProId()+" "+p.getProName()+" "+p.getProPrice());
		for(Product product:products) {
			System.out.println(product.getProId()+" "+product.getProName()+" "+product.getProPrice());
		}
	}

}
