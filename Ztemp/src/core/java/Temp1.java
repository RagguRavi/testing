package core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Temp1 {
public static void main(String[] args) {
	
 List<Long> mList = new ArrayList<>();
 mList.add(new Long(1));
 mList.add(new Long(2));
 mList.add(new Long(3));
 mList.add(new Long(2));
 mList.add(new Long(5));
 mList.add(new Long(7));
System.out.println(mList);
 
System.out.println(mList.removeAll(Collections.singleton(new Long(2))));
System.out.println(mList);

 

}
}
