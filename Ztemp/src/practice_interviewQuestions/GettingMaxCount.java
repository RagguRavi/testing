package practice_interviewQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class GettingMaxCount {
	public static void main(String args[]) {
		List<Integer> li = List.of(1,2,2,3,3,4,4,4,5,5);
		System.out.println(
				li.stream().collect(
						Collectors.groupingBy(
								Integer::intValue
								,Collectors.counting()
								)
						)
			);
	}
}
