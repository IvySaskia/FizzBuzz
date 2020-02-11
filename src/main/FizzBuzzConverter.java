package main;

public class FizzBuzzConverter {
	
    public void generateMultipleFizzBuzz() {
        for (Integer i = 0; i < 100 ; i++) {
            System.out.println(generateFizzBuzz(i));
        }
    }
	
    public String generateFizzBuzz(Integer number) {
        if (isMultipleOf3(number) && isMultipleOf5(number))
			{
				return "FizzBuzz";                    
			}
			else 
				if(isMultipleOf3(number))
				{
					return"Fizz";
				}
				else 
					if(isMultipleOf5(number))
					{
						return "Buzz";
					}
					else
						return String.valueOf(number);
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

}