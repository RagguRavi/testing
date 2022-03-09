package core.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp7 {
 public static void main(String[] args) {
//	String text = "This  is text";
//	System.out.println(text.matches("This is text"));
//	System.out.println(text.matches("This\\s+is\\stext"));
	
	String str1 = "~s";
//	System.out.println(str1.matches("."));
	
	/*
	str1 = "954-224-7432sdfsd 61 846-11999asddf 561632-5776 sdf917-9220619sdf sdf9089522303sdff asdf305 298 4744 954 999-3884 786-245 1593 954 494 -4526 954  471-1571";
	str1 += "954**376**9050 786*200*3082  954*-444-3202 954*349**1069 305*332-9586 786-378*0420  954-*662**6571 954-*295-7139 954*349**1069 9*54-554-1583 305-962-*3310 201*294/4478";
	str1 += "561 251-+2408 786 4277623 5+61 866-4939 (786) 683-5995 561v267-1725 9*54-554-1583 5+61 866-4939";
*/
	str1 = "Ravi Kumar tholiya";
//	System.out.println(str1.matches("\\[abc]"));
	
//	System.out.println(Pattern.matches("[^abc]","q" ));
	
//	System.out.println(Pattern.matches("[a-zA-Z]","A" ));
	
//	System.out.println(Pattern.matches("[a-d[p-z]]","k" ));
	
//	System.out.println(Pattern.matches("[a-z&&[^pqr]]","q" ));

//	System.out.println(Pattern.matches("x{2,6}","x" ));
	String one1 = "||||||||";
//	System.out.println(Pattern.matches("\\b","\t"));
//	((\\\\d{1}/\\\\d{2}/\\\\d{4})|(\\\\d{2}/\\\\d{2}/\\\\d{4})|(\\\\d{2}/\\\\d{1}/\\\\d{4})|(\\\\d{1}/\\\\d{1}/\\\\d{4}))";
	
	String one = "(\\d{3}-\\d{3}-\\d{4})";
	String two = "(\\d{3}\\s\\d{3}\\s\\d{4})";
	String three = "(\\d{3}\\s+\\d{3}-\\d{4})";
	String four = "(\\d{3}-\\d{3}\\s\\d{4})";
	String five = "(\\d{3}\\s\\d{3}\\s-\\d{4})";
	String six = "(\\d{3}\\s\\s\\d{3}\\s-\\d{4})";
//	String seven = "(\\d{2}\\s\\d{3}-\\d{5})";
	String eight = "(\\d{6}-\\d{4})";
	String nine = "(\\d{3}-\\d{7})";
	
	String ten = "(\\d{10})";
	
	String eleven = "(\\d{3}\\*-\\d{3}-\\d{4})";
	String twelve ="(\\d{3}\\*\\*\\d{3}\\*\\*\\d{4})";
	String thirteen = "(\\d{3}\\*\\d{3}-\\d{4})";
	String fourteen = "(\\d{3}-\\d{3}\\*\\d{4})";
	String fifteen = "(\\d{3}-\\*\\d{3}\\**\\d{4})";
	String sixteen = "(\\d{3}\\*\\d{3}\\*\\d{4})";
	String seventeen = "(\\d{3}\\-\\*\\d{3}-\\d{4})";
	String eigthteen = "(\\d{3}\\*\\d{3}\\*\\*\\d{4})";
//	String nineteen = "(\\d{1}\\*\\d{2}-\\d{3}-\\d{4})";
	String twentieth = "(\\d{3}-\\d{3}-\\*\\d{4})";
	
	String tone = "(\\d{3}\\*\\d{3}\\/\\d{4})";
//	String ttwo = "(\\d{1}\\+\\d{2}\\s\\d{3}-\\d{4})";
	String tthree = "(\\(\\d{3}\\)\\s\\d{3}-\\d{4})";
	String tfour = "(\\d{3}\\=\\d{3}\\=\\d{4})";
	String tfive = "(\\d{3}\\-\\d{3}\\=\\d{4})";
	String tsix = "(\\d{3}\\s\\d{7})";
	String tseven = "(\\d{3}v\\d{3}\\-\\d{4})";
	String teight = "(\\d{3}\\=\\d{3}\\-\\d{4})";
	String tinine = "(\\d{3}\\s\\d{3}\\-\\+\\d{4})";
	String thirty = "(\\d{3}\\/\\d{3}\\/\\d{4})";
	
	String thOne = "(\\d{3}\\=\\d{3}\\-\\d{4})";
	String thTwo = "(\\d{3}\\.\\d{3}\\.\\d{4})";

	StringBuffer stringBuffer = new StringBuffer();
	stringBuffer.append(one+"|"+two+"|"+three+"|"+four+"|"+five+"|"+six+"|"+eight+"|"+nine+"|"+ten+"|");
	stringBuffer.append(eleven+"|"+twelve+"|"+thirteen+"|"+fourteen+"|"+fifteen+"|"+sixteen+"|"+seventeen+"|"+eigthteen+"|"+twentieth+"|");
	stringBuffer.append(tone+"|"+tthree+"|"+tfour+"|"+tfive+"|"+tsix+"|"+tseven+"|"+teight+"|"+tinine+"|"+thirty+"|");
	stringBuffer.append(thOne+"|"+thTwo);
	
	System.out.println(stringBuffer);

	str1= "SINCE 03/04/2016 A RX IS NEEDED REF#FL2016994683704 *DS*";
	Pattern pattern = Pattern.compile("("+stringBuffer.toString()+")");
	Matcher matcher = pattern.matcher(str1);

	int index = 0;
	while(matcher.find()) {
		index++;
		System.out.println(index+"\t"+matcher.group(0));
	}
	

}
}
