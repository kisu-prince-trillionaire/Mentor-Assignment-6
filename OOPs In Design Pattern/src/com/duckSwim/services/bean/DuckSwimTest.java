package com.duckSwim.services.bean;

public class DuckSwimTest {

	public static void main(String[] args) {
//		Duck duck = new Duck();
//		The above line of code cannot be compiled and hence will give an Error.class
//		The concept behind that compilation error is that---
//		1.Abstract class cannot be instantaniated.
//		2.Object of an abstract class cannot be created.
//		3.Method of abstract class cannot be called using an object of an abstract class
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("--------------------------------------------------");
		Duck deckyDuck = new DeckyDuck();
		deckyDuck.fly();
		deckyDuck.quack();
		deckyDuck.swim();
		deckyDuck.duckMethod();
		System.out.println("---------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("---------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		Duck molarDuck = new MolarDuck();
		molarDuck.fly();
		molarDuck.quack();
		molarDuck.swim();
		molarDuck.duckMethod();
		System.out.println("---------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}
}
//---------------------------------OUTPUT-----------------------------------------
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//--------------------------------------------------
//Static Block 1 of Duck Class
//Static Block 2 Duck Class
//Static Block 1 of DeckyDuck Class
//Static Block 2 of DeckyDuck Class
//Non Static Block 1 of Duck Class
//Non Static Block 2 of Duck Class
//Default Constructor of Duck Class
//Non Static Block 1 of DeckyDuck Class
//Non Static Block 2 of DeckyDuck Class
//Default constructor of DeckyDuck Class
//Flying
//Quacking
//DeckyDuck Swimming
//Ducks's Concrete Method
//---------------------------------------------------
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//---------------------------------------------------
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//Static Block 1 of MolarDuck Class
//Static Block 2 of MolarDuck Class
//Non Static Block 1 of Duck Class
//Non Static Block 2 of Duck Class
//Default Constructor of Duck Class
//Non Static Block 1 of MolarDuck Class
//Non Static Block 2 of MolarDuck Class
//Default constructor of MolarDuck Class
//Flying
//Quacking
//MolarDuck Swimming
//Ducks's Concrete Method
//---------------------------------------------------
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
