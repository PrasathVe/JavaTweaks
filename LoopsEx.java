package com.java.java20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopsEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Mercedez");
		list.add("BMW");
		list.add("Audi");
		list.add("Jaguar");
		
		//Basic For Loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//Enhanced For Loop
		for (String string : list) {
			System.out.println(string);
			
		}
		//Basic Loop Iterator
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String car = (String) iterator.next();
			System.out.println(car);
		}
		//iterator with while loop
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
		String list1 = (String) iterator.next();
		System.out.println(list1);
		
	}
		//Java 8 Stream + lambda Example
		list.stream().forEach(list1 -> System.out.println(list1));
			
		//java 8 for each + lambda
		list.forEach((list1)->System.out.println(list1));
		}
	
		

	}


