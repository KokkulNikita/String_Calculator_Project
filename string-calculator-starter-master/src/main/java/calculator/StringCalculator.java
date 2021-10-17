package calculator;

class StringCalculator {
	
	private final String delimiter =",|\n" ;

    public int add(String input) throws Exception {
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
    
    private int sum(String[] numbers) throws Exception {
    	findException(numbers);
    	
    	return calculateValues(numbers);
    }
    
    private int calculateValues(String[] numbers) {
    int addition=0;
	for(String current:numbers) {
			if(stringToInt(current)>1000) {
				continue;
			}
			addition=addition+ stringToInt(current);
		}
	return addition;
    }
    
    private void findException(String[] numbers) throws Exception {
    for(String current:numbers) {
		if(stringToInt(current)<0) {
			throw new Exception("Negative input");
		}
	}
    }
   
    private boolean isEmpty(String input) {
    	return input.isEmpty();
    }
    
    private int stringToInt(String input) {
    	return Integer.parseInt(input);
    }

}