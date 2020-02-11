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

}
