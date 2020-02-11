package main;

public class FizzBuzzConverter {
	
    public void generateMultipleFizzBuzz() {
        for (Integer i = 0; i < 100 ; i++) {
            System.out.println(generate(i));
        }
    }
	
    public String generate(Integer number) {
    	
    	String value = "";
    	
    	if(isFizz(number)) {
    		value="Fizz";
    	}
		if(isBuzz(number)) {
			value+="Buzz";
		}
		if(isNotFizzAndIsNotBuzz(number)){
			value = String.valueOf(number);
		}
		
		return value;
    }
    
    public Boolean isMultipleOf3(Integer number) {
    	return isMultipleOfNumber(number,3);
    }
    
    public Boolean isMultipleOf5(Integer number) {
    	return isMultipleOfNumber(number,5);
    }
    
    public Boolean isMultipleOf15(Integer number) {
    	return isMultipleOfNumber(number,15);
    }
    
    public Boolean isMultipleOfNumber(Integer number, Integer multiple) {
    	return number % multiple == 0;
    }
    
    public Boolean isFizz(Integer number) {
    	return isMultipleOf3(number);
    }
    
    public Boolean isBuzz(Integer number) {
    	return isMultipleOf5(number);
    }
    
    public Boolean isNotFizzAndIsNotBuzz(Integer number) {
    	return !isFizz(number) && !isBuzz(number);
    }

}