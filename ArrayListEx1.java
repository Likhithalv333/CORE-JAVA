package com.satya.collections;
import java.util.*;
public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//non synchronous
		ArrayList<Employee> emps=new ArrayList<Employee>();
		emps.add(new Employee(1001,"chilaka",10000.89));
		emps.add(new Employee(1002,"gilaka",20000.89));
		emps.add(new Employee(1003,"kilaka",70000.89));
		emps.add(new Employee(1004,"molaka",50000.89));
		emps.add(new Employee(1005,"prathu",90000.89));
		Employee first = emps.get(0);
		System.out.println(first);
		Employee last=emps.get(emps.size()-1);
		System.out.println(last);
		System.out.println("-----------");
		for(Employee emp:emps) {
			System.out.println(emp);
		}

	}

}
