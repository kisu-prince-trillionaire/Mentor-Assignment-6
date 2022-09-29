package com.cloneDemo;

public class CloneDemo implements Cloneable {
	int number;
	transient int data;

	public CloneDemo(int number, int data) {
		this.number = number;
		this.data = data;
	}

	public CloneDemo() {
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "CloneDemo [number=" + number + ", data=" + data + "]";
	}
	
	
}
