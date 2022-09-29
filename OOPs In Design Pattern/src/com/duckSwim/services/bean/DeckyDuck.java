package com.duckSwim.services.bean;

public class DeckyDuck extends Duck {
	
	public DeckyDuck() {
		System.out.println("Default constructor of DeckyDuck Class");
	}
	
	static {
		System.out.println("Static Block 1 of DeckyDuck Class");
	}
	
	static {
		System.out.println("Static Block 2 of DeckyDuck Class");
	}
	
	{
		System.out.println("Non Static Block 1 of DeckyDuck Class");
	}
	
	{
		System.out.println("Non Static Block 2 of DeckyDuck Class");
	}
	
	public void deckyDuckMethod() {
		System.out.println("Decky Duck Method");
	}

	@Override
	public void swim() {
		System.out.println("DeckyDuck Swimming");
	}
}
