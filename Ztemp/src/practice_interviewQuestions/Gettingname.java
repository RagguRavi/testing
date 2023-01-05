package practice_interviewQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class Gettingname {
	public static void main(String args[]) {
		String name = "ravi kumar";
		System.out.println(
				List.of(name.split("")).stream()
				.collect(
						Collectors.groupingBy(a -> a.toString(),Collectors.counting())
						)
		);
	}
}
