package com.java.practices;

import java.util.Scanner;

public class ConvertFirstLetterToUpper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence :");
		String input = scan.nextLine();
		
			char [] charArray = input.toCharArray();
			boolean foundSpace = true;
			
		for(int i=0;i<charArray.length;i++) {
				if(Character.isLetter(charArray[i])) {
					if (foundSpace) {
						charArray[i]=Character.toUpperCase(charArray[i]);
						foundSpace=false;
						}
					}else {
						foundSpace=true;
					}
				}
		
			input = String.valueOf(charArray);
			System.out.println("After Convertion :"+input);
		}
		
		
	

	}


