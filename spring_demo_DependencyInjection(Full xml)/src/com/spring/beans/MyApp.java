package com.spring.beans;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		Coach bc = new BaseBallCoach();
		//use the object
		System.out.println(bc.getDailyWorkOut());
		
		
		Coach tc = new TrackCoach();
		
		System.out.println(tc.getDailyWorkOut());
		
		
		System.out.println();

	}

}
