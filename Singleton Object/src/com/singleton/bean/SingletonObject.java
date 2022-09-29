package com.singleton.bean;

public class SingletonObject {
	private static SingletonObject singletonObject = null;

	private SingletonObject() {
	}

	public SingletonObject(SingletonObject singletonObject) {
		SingletonObject.singletonObject = singletonObject;
	}

	public static void setSingletonObject(SingletonObject singletonObject) {
		SingletonObject.singletonObject = singletonObject;
	}

	public static SingletonObject getSingletonObject() {
		int count = 0;
		if (singletonObject == null) {
			SingletonObject newSingletonObject = new SingletonObject();
			singletonObject = newSingletonObject;
			count++;
			System.out.println("getSingletonObject working : " + count);
		}else {
			System.out.println("Singleton Object is not null");
		}
		return singletonObject;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
