package com.sonarqube;

import java.io.File;
import java.io.IOException;

public class FirstSonarjava {

		public static final String abc="";
		public static String [] strings1 = {"first","second"};
		
		public static void main(String[] args) {
			String MayBeNull = null;
			System.out.println("Hello SonarQube "+MayBeNull);
			 
			for (int i = 10; i < 10; i++) { 
				System.out.println("Loop not true even once"); //Bug
			}
				
		}
}
