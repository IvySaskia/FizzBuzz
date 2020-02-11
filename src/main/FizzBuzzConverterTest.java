package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FizzBuzzConverterTest {
	
	private static FizzBuzzConverter fizzBuzzConverter;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Antes de todas");
		fizzBuzzConverter = new FizzBuzzConverter();
	}
	


}
