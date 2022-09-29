package com.check;

public class CheckForInterface {

	public static void main(String[] args) {
		Class var = String.class;
		
		if(var.isInterface()) {
			System.out.println("It is an interface");
		}else if(var.isLocalClass()){
			System.out.println("Its a class");
		}else {
			System.out.println("It is neither Interface nor a class");
		}
	}

}
