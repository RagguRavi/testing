package core.algo.simple;

public class ASimpleFraction {

	public static void main(String[] args) {
		 System.out.println(count(1024));
		
	}

	static long count(long n)  {
      StringBuilder sb = new StringBuilder();
      
      while(n >0 ) {
    	  if((n&1) != 0) {
    		  sb.append("1");
    	  } else {
    		  sb.append("0");
    	  }
    	  
    	  sb.reverse();
    	  n = n>>1;
      }
      
      String arr[] = sb.toString().split("");
      
      System.out.println(sb);
		return 0;
    }
	
	static int getAllCombination(String str[]) {
		
		return 0;
	}
	
	static int getAllCombination(String str) {
		if(str.length() == 1) {
			return 1;
		}
		
		return 1;
	}
	
	static int findPosition(int N) {
        int count = 0;
        int temp = N;
        while(temp > 0) {
            if(count > 1) {
                return -1;
            }
            
            count++;
            temp = temp & (temp-1);
        }
        
        temp = N;
        count=1;
        
        while(temp > 0){
          
            if((temp & 1)!=0){
                return count;
            }
            count++;
            temp = temp >> 1;
            
        }
        
        
        return -1;
    }
	
	public static int countBitsFlip(int a, int b){
        
	       int temp = a ^ b;
	       int count = 0;
	       while(temp > 0) {
	           count++;
	           
	           temp = temp & (temp-1);
	       }
	        
	        return count;
	    }

    public static String  fractionToDecimal(int numerator, int denominator) {
       float whole = numerator/Float.parseFloat(denominator+"");
       int other = numerator%denominator;
       
       System.out.println(whole +" \t" +other);
       return null;
    }
}
