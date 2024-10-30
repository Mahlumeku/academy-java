package com.bptn.course._11_abstract_class;

public abstract class Animal {
	// Abstract Method
	public abstract void sound();

	// Concrete Method
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
	// Messages addressed to ("meeting group chat" will also appear in the meeting
	// group chat in Team Chat

}
