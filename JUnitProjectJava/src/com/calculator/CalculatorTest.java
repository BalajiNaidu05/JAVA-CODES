package com.calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest 
	{
		Calculator calc = new Calculator();
		
		@Test
		public void testAddition() 
		{
			assertEquals(15.0, calc.add(10,5),0);
		}
		@Test
		public void testSubtraction()
		{
			assertEquals(5.0,calc.subtract(10, 5),0);
		}
		@Test
		public void testMultiplication()
		{
			assertEquals(50.0,calc.multiply(10, 5),0);
		}
		@Test
		public void testDivision()
		{
			assertEquals(2.0,calc.divide(10,5),0);
		}
		@Test (expected = ArithmeticException.class)
		public void testDivisionByZero()
		{
			calc.divide(10, 0);
		}
	}
