package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TypeInference {
	
//	var name = "clazz"; // compilation problem
	String s;

	public TypeInference() {
		var x = 10;
	}
	
//	public TypeInference(var s) {
	public TypeInference(String s) {
		this.s = s;
	}
	
	public static void main(String[] args) {
		var x = 10;
//		var y = 20;
		var y = 10;
		if(x == y ) {
			System.out.println("Hello world type inference, x ==y is true");
		}
		
		var date = LocalDate.now();
		System.out.println(date);
		
		var datetime = LocalDateTime.now();
		System.out.println(datetime);
		m1();
	}
	
//	public static void m1(var z) { //Var is not allowed here
	public static void m1() {
		var x = "Hello from java 10";
		System.out.println(x);
//		var x = null;
		var y = (String) null;
		System.out.println(y);
		var list = new ArrayList<String>();
		list.add("hi");
		System.out.println(list.get(0).charAt(0));	
	}
}
