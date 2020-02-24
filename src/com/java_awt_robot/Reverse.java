package com.java_awt_robot;

public class Reverse {

	public static void reverseinput_usingbuiltinmethod(String input) {
		StringBuffer sb = new StringBuffer(input);
		System.out.println(sb.reverse());
	}
	
	public static void reversetheText(String text) {
		String[] items = new String[5];
		String[] newtext = text.split(" ");
		
		for (int letter = newtext.length-1; letter >= 0 ; letter -- ) {
			items[letter] = newtext[letter];
		}
		
		for (int i = items.length-1; i >= 0 ; i--) {				
				System.out.print(items[i]+ " ");
		}
	}
	
	public static void reverseCharacters(String input) {
		String reverse = "";
		for (int i = input.length() -1; i >= 0 ;i--) {
			reverse = reverse + input.charAt(i);
		}
		System.out.println();
		System.out.println(reverse);
		
	}

}

