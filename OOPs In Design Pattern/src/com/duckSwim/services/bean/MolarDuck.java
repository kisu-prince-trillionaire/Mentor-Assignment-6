package com.duckSwim.services.bean;

public class MolarDuck extends Duck {
	
	public MolarDuck() {
		System.out.println("Default constructor of MolarDuck Class");
	}
	
	static {
		System.out.println("Static Block 1 of MolarDuck Class");
	}
	
	static {
		System.out.println("Static Block 2 of MolarDuck Class");
	}
	
	{
		System.out.println("Non Static Block 1 of MolarDuck Class");
	}
	
	{
		System.out.println("Non Static Block 2 of MolarDuck Class");
	}
	
	public void molarDuckMethod() {
		System.out.println("Molar Duck Method");
	}

	@Override
	public void swim() {
		System.out.println("MolarDuck Swimming");
	}
}
