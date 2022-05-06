package core.algo.simple;

public class ASimpleFraction {

	public static void main(String[] args) {
		 
		fractionToDecimal(1, 3);
	}

	

    public static String  fractionToDecimal(int numerator, int denominator) {
       float whole = numerator/Float.parseFloat(denominator+"");
       int other = numerator%denominator;
       
       System.out.println(whole +" \t" +other);
       return null;
    }
}
