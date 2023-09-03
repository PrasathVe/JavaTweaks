package com.java.practices;

public class CountTheNumbersFromString {

	public static void main(String[] args) {
		String given = "My H37te8Genic";
		
		int total=0;
		int length = given.length();
		
		for (int i=0; i<length;i++) {
			Character character = given.charAt(i);
			
			if(Character.isDigit(character)) {
				total = total+Character.getNumericValue(character);
			}
		}
			System.out.println(total);
	}

}
