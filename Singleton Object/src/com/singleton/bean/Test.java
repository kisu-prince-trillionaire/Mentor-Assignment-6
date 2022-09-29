package com.singleton.bean;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonObject singletonObject = null;
		SingletonObject obj = new SingletonObject(singletonObject);
		SingletonObject.getSingletonObject();
		SingletonObject obj1 = new SingletonObject(obj);
		SingletonObject.getSingletonObject();
		SingletonObject obj2 = new SingletonObject(obj);
		SingletonObject.getSingletonObject();
		SingletonObject obj3 = new SingletonObject(obj);
		SingletonObject.getSingletonObject();
	}
}
//----------------------OUTPUT-------------------------
//getSingletonObject working : 1
//Singleton Object is not null
//Singleton Object is not null
//Singleton Object is not null
	
/*
 * The default constructor is private so it cannot be initialized or object can
 * be created. Yes SingletonObject class is a Singleton class. I was not able to
 * create a new class of the same name
*/