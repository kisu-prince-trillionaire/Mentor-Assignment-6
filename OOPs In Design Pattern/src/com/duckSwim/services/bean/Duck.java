package com.duckSwim.services.bean;

public abstract class Duck implements Flyable, Quackable {
	private Flyable f;
	private Quackable q;
	
	public Duck() {
		System.out.println("Default Constructor of Duck Class");
	}
	
	public Duck(Flyable f,Quackable q) {
		this.f = f;
		this.q = q;
	}

	public Flyable getF() {
		return f;
	}

	public void setF(Flyable f) {
		this.f = f;
	}

	public Quackable getQ() {
		return q;
	}

	public void setQ(Quackable q) {
		this.q = q;
	}
	
	public abstract void swim();
	
	public void fly() {
		System.out.println("Flying");
	}
	
	public void quack() {
		System.out.println("Quacking");
	}
	
	public void duckMethod() {
		System.out.println("Ducks's Concrete Method");
	}
	
	static {
		System.out.println("Static Block 1 of Duck Class");
	}
	
	static {
		System.out.println("Static Block 2 Duck Class");
	}
	
	{
		System.out.println("Non Static Block 1 of Duck Class");
	}
	
	{
		System.out.println("Non Static Block 2 of Duck Class");
	}

}
