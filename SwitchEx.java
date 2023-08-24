package com.java.java20;

public class SwitchEx {
	public void switchExpressionEx() {
		//Expression will return something
		String day = "Mon";
		String sleepTime = "";
		
		sleepTime = switch(day) {
		case "Sat", "Sun" ->
			sleepTime = "11:30 PM";
		
		case "Wed" ->
		sleepTime = "10 PM";
		default ->
		sleepTime = "11 PM";
		
		};
		System.out.println(sleepTime);

		
	}

	public static void main(String[] args) throws Exception {
		SwitchEx examp = new SwitchEx() ;
		examp.switchExpressionEx();
			
		
		
		String day = "Mon";
		String wakeUpTime = "";
		//Arrow instead of Break
		//Switch Statement
		switch(day) {
		case "Sat", "Sun" ->
		wakeUpTime = "6 AM";
		
		case "Wed" ->
		wakeUpTime = "8 AM";
		default ->
		wakeUpTime = "7 AM";
		
		}
		System.out.println(wakeUpTime);
		

	}

}
