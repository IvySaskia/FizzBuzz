package main;

public class FizzBuzzConverter {
	
    public void generateMultipleFizzBuzz() {
        for (Integer i = 0; i < 100 ; i++) {
            System.out.println(generateFizzBuzz(i));
        }
    }
	
    public String generateFizzBuzz(Integer number) {
        if (number % 3 == 0 && number % 5 == 0)
			{
				return "FizzBuzz";                    
			}
			else 
				if(isMultipleOf3(number))
				{
					return"Fizz";
				}
				else 
					if(number % 5 == 0)
					{
						return "Buzz";
					}
					else
						return String.valueOf(number);
    }
    
    public Boolean isMultipleOf3(Integer number) {
    	Boolean answer = false;
        if (number % 3 == 0) {
            answer = true;                    
        }
        return answer;
    }
    
}