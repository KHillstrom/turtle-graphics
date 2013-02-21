package edu.macalester.generator;


public class FibonacciGenerator {
    public int a = 0;
	public int b = 1;
	public int oldA = a;
	public int oldB = b;
    
    public double next() {
    	a = oldB;
    	b = oldA + oldB;
    	
    	oldA = a;
    	oldB = b;
    	
    	return b;
    }
}