package calculator;

class StringCalculator {
	
	private final String delimiter =",|\n" ;

    public int add(String input) {
    	String[] numbers =input.split(delimiter);
    	
    	if(isEmpty(input)) {
    		  return 0;
    	}
    	
    	if(input.length()==1) {
    		return stringToInt(input);
    	}
    	else {
    		return sum(numbers);
    	}
    }
    
    private int sum(String[] numbers) {
    	int addition=0;
    	for(int i=0;i<numbers.length;i++) {
    	addition=addition+ stringToInt(numbers[i]);
    	}
    	return addition;
    }
    
    private boolean isEmpty(String input) {
    	return input.isEmpty();
    }
    
    private int stringToInt(String input) {
    	return Integer.parseInt(input);
    }

}