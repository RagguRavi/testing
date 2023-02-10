package functional_programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP04 {

	public static void main(String[] args) {
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));
		
		Predicate<Course> lessThan90 = (course) -> course.getReviewScore() <90;
		Predicate<Course> greaterThan90 = (course) -> course.getReviewScore() > 90;
		Predicate<Course> greaterThan95 = (course) -> course.getReviewScore() > 95;
		Predicate<Course> lessThan95 = (course) -> course.getReviewScore() < 95;
		
//		System.out.println(courses.stream().allMatch(greaterThan95));
		System.out.println(courses.stream().noneMatch(lessThan90));
		Comparator<Course> byNoOfStudents = Comparator.comparing(Course::getNoOfStudents);
		Comparator<Course> byNoOfStudentsReverse = Comparator.comparing(Course::getNoOfStudents).reversed();
		
		Comparator<Course> byCourseName = Comparator.comparing(Course::getName);
		Comparator<Course> byCourseNameReverse = Comparator.comparing(Course::getName).reversed();
		
		Comparator<Course> byNoOfStudentsAndReviewScore = Comparator.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore).reversed();
		
//		courses.stream().sorted(byNoOfStudentsAndReviewScore)
////		.skip(1)
//		.limit(3)
//		.forEach(System.out::println);
		
		courses.forEach(System.out::println);
		System.out.println("-----------------------------------------");
		/**
		Spring:20000:98
		Spring Boot:18000:95
		API:22000:97
		Microservices:25000:96
		 */
//		courses.stream().takeWhile(course -> course.getReviewScore() >= 95).forEach(System.out::println);
		
		/*
		 *
FullStack:14000:91
AWS:21000:92
Azure:21000:99
Docker:20000:92
Kubernetes:20000:91
		 */
//		courses.stream().sorted(byNoOfStudentsAndReviewScore).forEach(System.out::println);
		
//		System.out.println(courses.stream().min(byNoOfStudentsAndReviewScore));
//		System.out.println(courses.stream().max(byNoOfStudentsAndReviewScore));
		
		/*
		 * System.out.println( courses.stream().filter(lessThan95).findAny() );
		 * 
		 * System.out.println( courses.stream().filter(lessThan95).findFirst() );
		 */
		
//		System.out.println(courses.stream().filter(lessThan95).mapToInt(c -> c.getNoOfStudents()).max());
		
//		System.out.println(courses.stream().filter(lessThan95).mapToInt(c -> c.getNoOfStudents()).sum());
		
//		System.out.println(courses.stream().filter(lessThan95).mapToInt(c -> c.getNoOfStudents()).average());
		
		System.out.println(
				courses.stream().collect(Collectors.groupingBy(Course::getCategory))
				);
		
		System.out.println(
				courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting()))
			);
		
		Collectors.maxBy(Comparator.comparing(Course::getNoOfStudents));
		System.out.println(
				courses.stream()
				.collect(
						Collectors.groupingBy(
								Course::getCategory
								,Collectors.maxBy(Comparator.comparing(Course::getNoOfStudents))
								)
						
					));
		

	}

}


class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}

}
