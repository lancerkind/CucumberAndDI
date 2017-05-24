package com.my.features.definitions;

public class Counter {
	private int count = 0;
	public void increment() {
		count++;
	}
	public String toString() {
		return Integer.toString(count);
	}
}
