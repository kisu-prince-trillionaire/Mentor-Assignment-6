package com.cloneDemo;

public class TestMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneDemo test1 = new CloneDemo(5,7);
		System.out.println(test1);
		System.out.println("The cloned data is ");
		CloneDemo test2 = (CloneDemo)test1.clone();
		System.out.println(test2);
		
		CloneDemo test3 = new CloneDemo(15,17);
		System.out.println(test3);
		System.out.println("The cloned data is ");
		CloneDemo test4 = (CloneDemo)test3.clone();
		System.out.println(test4);
	}
}
//-----------------------OUTPUT-----------------------------
//CloneDemo [number=5, data=7]
//The cloned data is 
//CloneDemo [number=5, data=7]
//CloneDemo [number=15, data=17]
//The cloned data is 
//CloneDemo [number=15, data=17]