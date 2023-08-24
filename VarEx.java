package com.java.java20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VarEx {
	public void usingVar() throws IOException {
		var reader = new InputStreamReader(System.in);
		var buffer = new BufferedReader(reader);
		var name = new ArrayList<>();
		
		name.add(buffer.readLine());
		name.add(buffer.readLine());
		
		System.out.println(name);
	}

	public static void main(String[] args) throws Exception {
		
		VarEx variable = new VarEx();
		variable.usingVar();
		
			//Old Method
		
		  InputStreamReader reader = new InputStreamReader(System.in); BufferedReader
		  buffered = new BufferedReader(reader); ArrayList<String> names = new
		  ArrayList<>();
		  
		  names.add(buffered.readLine()); names.add(buffered.readLine());
		  
		  System.out.println(names);
		 
	}

}
