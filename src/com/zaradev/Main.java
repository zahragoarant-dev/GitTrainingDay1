package com.zaradev;

public class Main {
	
	public static void greet() {
		System.out.println("Bienvenue dans Git !");
	}
	
	public static String toUpper(String text) {
		return text.toUpperCase();
	}

	public static void main(String[] args) {
		System.out.println("Feature branch version");
		greet();
		System.out.println(toUpper("git training"));
	}
}
