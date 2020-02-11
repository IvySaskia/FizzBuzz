package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FizzBuzzConverterTest {
	
	private static FizzBuzzConverter fizzBuzzConverter;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before all");
		fizzBuzzConverter = new FizzBuzzConverter();
	}
	
	@Test
	void testIsMultipleOf3() {
		assertTrue(fizzBuzzConverter.isMultipleOf3(0));
		assertFalse(fizzBuzzConverter.isMultipleOf3(1));
		assertFalse(fizzBuzzConverter.isMultipleOf3(2));
		assertTrue(fizzBuzzConverter.isMultipleOf3(3));
		assertFalse(fizzBuzzConverter.isMultipleOf3(4));
		assertFalse(fizzBuzzConverter.isMultipleOf3(5));
		assertTrue(fizzBuzzConverter.isMultipleOf3(6));
		assertFalse(fizzBuzzConverter.isMultipleOf3(7));
		assertFalse(fizzBuzzConverter.isMultipleOf3(8));
		assertTrue(fizzBuzzConverter.isMultipleOf3(9));
	}
	
	void testIsMultipleOf5() {
		assertTrue(fizzBuzzConverter.isMultipleOf5(0));
		assertFalse(fizzBuzzConverter.isMultipleOf5(1));
		assertFalse(fizzBuzzConverter.isMultipleOf5(2));
		assertFalse(fizzBuzzConverter.isMultipleOf5(3));
		assertFalse(fizzBuzzConverter.isMultipleOf5(4));
		assertTrue(fizzBuzzConverter.isMultipleOf5(5));
		assertFalse(fizzBuzzConverter.isMultipleOf5(6));
		assertFalse(fizzBuzzConverter.isMultipleOf5(7));
		assertFalse(fizzBuzzConverter.isMultipleOf5(8));
		assertFalse(fizzBuzzConverter.isMultipleOf5(9));
		assertTrue(fizzBuzzConverter.isMultipleOf5(10));
	}
	
	void testIsMultipleOf15() {
		assertTrue(fizzBuzzConverter.isMultipleOf15(1));
		assertFalse(fizzBuzzConverter.isMultipleOf15(2));
		assertFalse(fizzBuzzConverter.isMultipleOf15(3));
		assertFalse(fizzBuzzConverter.isMultipleOf15(4));
		assertTrue(fizzBuzzConverter.isMultipleOf15(5));
		assertFalse(fizzBuzzConverter.isMultipleOf15(6));
		assertFalse(fizzBuzzConverter.isMultipleOf15(7));
		assertFalse(fizzBuzzConverter.isMultipleOf15(8));
		assertFalse(fizzBuzzConverter.isMultipleOf15(9));
		assertTrue(fizzBuzzConverter.isMultipleOf15(10));
		assertFalse(fizzBuzzConverter.isMultipleOf15(11));
		assertFalse(fizzBuzzConverter.isMultipleOf15(12));
		assertFalse(fizzBuzzConverter.isMultipleOf15(13));
		assertFalse(fizzBuzzConverter.isMultipleOf15(14));
		assertTrue(fizzBuzzConverter.isMultipleOf15(15));
	}
	void testIsMultipleOfNumber() {
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(0,0));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(2,2));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(4,2));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(5,2));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(6,2));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(7,2));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(8,2));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(9,2));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(10,2));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(1,3));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(2,3));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(3,3));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(4,3));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(5,3));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(6,3));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(7,3));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(8,3));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(9,3));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(10,3));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(1,5));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(2,5));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(3,5));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(4,5));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(5,5));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(6,5));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(7,5));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(8,5));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(9,5));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(10,5));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(1,15));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(2,15));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(3,15));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(4,15));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(5,15));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(6,15));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(7,15));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(8,15));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(9,15));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(10,15));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(11,15));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(12,15));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(13,15));
		assertFalse(fizzBuzzConverter.isMultipleOfNumber(14,15));
		assertTrue(fizzBuzzConverter.isMultipleOfNumber(15,15));
	}

}
