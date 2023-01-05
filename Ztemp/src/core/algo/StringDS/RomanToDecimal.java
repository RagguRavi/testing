package core.algo.StringDS;

public class RomanToDecimal {

	public static void main(String[] args) {
		System.out.println(romanToDecimal("CMXVI"));

	}
	
	public static int romanToDecimal(String str) {
		int sum = 0;
        char[] arr = str.toCharArray();
		
        int oldVal = Integer.MAX_VALUE;
        for(char c : arr) {
        	
        	int number = getNumber(c);
        	
        	
        	if(oldVal < number) {
        		int tempnumber = number - (2*oldVal);
        		sum += tempnumber;
        	} else {
        		sum += number;
        	}
        	
        	oldVal = number;
        	
        }
		return sum;
    }
	
	
	public static int getNumber(char c) {
		int number = 0;
		switch(c) {
		case 'I':
			number = 1;
			break;
		case 'V':
			number = 5;
			break;
		case 'X':
			number = 10;
			break;
		case 'L':
			number = 50;
			break;
		case 'C':
			number = 100;
			break;
		case 'D':
			number = 500;
			break;
		case 'M':
			number = 1000;
			break;
		default: 
			number = -1;
		}
		
		return number;
	}

}
