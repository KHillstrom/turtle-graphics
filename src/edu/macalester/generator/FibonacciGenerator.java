package edu.macalester.generator;


public class FibonacciGenerator {
    private int cur;
    
    public FibonacciGenerator(int start) {
        cur = start - 1;  // make start the next number tested
    }
    
    public int next(int start) {
    	if (start == 0){
    		int previousPrevious = start;
    		return 0;
    	}
    	else if( start == 1){
    		int previous = start;
    		return 1;
    	}
    	else{
    		return previous + previousPrevious;
        }
    }

