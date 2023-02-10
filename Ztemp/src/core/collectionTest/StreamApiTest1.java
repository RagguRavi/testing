package core.collectionTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiTest1 {

	public static void main(String args[]) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(1, "Ravi", "chandigarh", 30000));
		emplist.add(new Employee(2, "Roni", "chandigarh", 50000));
		emplist.add(new Employee(3, "Nimrat", "chandigarh", 20000));
		emplist.add(new Employee(4, "Nitin", "Kurukshetra", 10000));
		emplist.add(new Employee(5, "Rupin", "Mohanli", 20000));
		emplist.add(new Employee(6, "Lakhvir", "Mohali", 30000));
		
		List<String> emplist1 = emplist.stream()
					.filter(e  ->  {
						System.out.println("filter called");
						return e.salary>20000;
					}).map(e -> {
						System.out.println("Map Called");
						return e.city;
					})
					.collect(Collectors.toList());
	}
}
	
	class Employee {
		int id;
		String name;
		String city;
		int salary;
		
		public Employee(int id, String name, String city, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
		}
		

	}

