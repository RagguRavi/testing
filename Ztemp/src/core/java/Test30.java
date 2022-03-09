package core.java;

import java.util.*;

public class Test30 {
	public static void main(String[] args) {
		Set<Book> set = new TreeSet<Book>();
		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(101, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to HashSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		// Traversing HashSet
		for (Book b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}

class Book implements Comparable<Book> {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	

	@Override
	public int compareTo(Book o) {
		Book b = o;
		String key1 = b.id+""+b.name+""+b.author;
		String key2 = this.id+""+this.name+""+this.author;
		if(key1.equals(key2)) {
			return 0;
		} else {
			return 1;
		}
	}

}
