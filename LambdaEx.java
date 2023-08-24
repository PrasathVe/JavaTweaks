package com.java.java20;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx {
	public void usingArrayList() {
		List<String> list = new ArrayList<>();
		
		list.add("Horse");
		list.add("Tiger");
		list.add("Lion");
		
		list.forEach((e) -> {System.out.print(e + " ");
		
		});
}

	public static void main(String[] args) {
		
		LambdaEx lamb = new LambdaEx();
		lamb.usingArrayList();

	}

}
