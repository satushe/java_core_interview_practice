/**
 * 
 */
package com.example.creational.designpattern;

/**
 * 
 */
public class SingletonPattern {

	//1. Private instance of the class
	private static SingletonPattern singletonPatternInstance;

	//2. Private constructor so that no one can create the instance of this class.
	private SingletonPattern() {
		// No logic to be provided.
	}
	 // Step 3: public static method to get the instance
	public static synchronized SingletonPattern getInstance() {
		if (singletonPatternInstance == null) {
			singletonPatternInstance = new SingletonPattern();

		}
		return singletonPatternInstance;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonPattern instance1 = SingletonPattern.getInstance();
        SingletonPattern instance2 = SingletonPattern.getInstance();

        System.out.println(instance1 == instance2); // true
	}

}
