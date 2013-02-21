package edu.macalester.generator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciGeneratorTest {

    @Test
    public void generatorSkipsComposites() {
    	FibonacciGenerator gen = new FibonacciGenerator();
        assertEquals(1, gen.next(), 0.0001);
        assertEquals(1, gen.next(), 0.0001);
        assertEquals(2, gen.next(), 0.0001);
    }
}
