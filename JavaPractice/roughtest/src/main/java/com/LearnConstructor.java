package com;

// AccessModifier [final] class name/type
public class LearnConstructor {

	String name;
	int age;
	// AccessModifier name([parameters])
	public LearnConstructor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public boolean isOlderThan(LearnConstructor other) {
		return this.age > other.getAge();
	}
	
	public static double area(double radius) {
		return 3.14 * radius * radius;
	}

	public static double area(double length, double width) {
		return length * width;
	}
}
