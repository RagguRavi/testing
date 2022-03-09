package core.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Temp21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "image/jpeg";
		System.out.println("image".contains(str));
		System.out.println("image");*/
		
		/*Date date = new Date();
		Date date2 =new  Date(1535717725103l);
		System.out.println(date.getTime());
		
		long diff = (date.getTime() - date2.getTime())/1000;
		System.out.println(diff);
		*/
		List<Integer> li = new ArrayList<>();
		li.add(2);
		li.add(1);
		li.add(5);
		li.add(4);
		li.add(7);
		li.add(2);
		System.out.println(li.size());
		/*li.stream().sorted((a1,a2)->{
			return a1-a2;
		}).collect(Collectors.toList());
*/
//		Collections.sort(li);
		List<Integer> aa = li.stream().sorted((i,j) ->{
			return j-i;
		}).collect(Collectors.toList());
		
		System.out.println(aa);
	}

}
