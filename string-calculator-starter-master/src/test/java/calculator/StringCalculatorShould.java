package calculator;

import org.junit.jupiter.api.Test;
 import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;



class StringCalculatorShould {
	  
	private StringCalculator stringCalculator=new StringCalculator();
	  
    @Test
    void empty_string_should_return_0() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
          assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    public  void two_Numbers_Comma_Delimited_Return_Sum() {
          assertEquals(4, stringCalculator.add("2,2"));
    }
    
    @Test
    public  void two_Numbers_NewLine_Delimited_Return_Sum() {
          assertEquals(6, stringCalculator.add("1\n5"));
    }
    
    @Test
    public  void three_Numbers_Delimited_Return_Sum() {
          assertEquals(8, stringCalculator.add("1,2,5"));
    }
    
    @Test
    public  void GreaterThan_1000_Ignore() {
          assertEquals(6, stringCalculator.add("1,2000,5"));
    }
    
//    @Test(expected =Exception.class)
//    	public void negative_Input_Returns_Exception() {
//    	stringCalculator.add("-1");
//    }
    
    
}
