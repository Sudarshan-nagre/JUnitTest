package com.sud.JUnitTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App a = new App();
    	int add = a.add(10,20);
    	System.out.println("Addition : "+add);
    }
    
    int add(int a, int b) {
    	return a+b;
    }
    
    boolean isBoolean() {
    	return false;
    }
    
    App app() {
    	return new App();
    }
}
