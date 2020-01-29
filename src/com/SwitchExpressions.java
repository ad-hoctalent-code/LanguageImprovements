package com;

public class SwitchExpressions {
	public static void main(String[] args) {
		int x = 1;
		
		switch(x) {
		case 1: System.out.println("One");
		break;
		case 2: System.out.println("Two");
		break;
		case 3: System.out.println("Three");
		break;
		
		}
		
		switch(x) {
			case 1 -> System.out.println("One");
			case 2 -> System.out.println("One");
			case 3 -> System.out.println("One");
		}
		var y = 3;
		
		final String result =
				switch(y) {
				case 1 -> "One";
				case 2 -> "Two";
				case 3,4 -> "three and four";
				default -> "Invalid";
				};
				
		System.out.println(result);
		
		
		
	}
}
