package core.java;

public class AssertExample {
	   public static void main(String[] args) {
		      int age = 14;
		      assert age <= 18 : "Cannot Vote";
		      System.out.println("The voter's age is " + age);
		   }
}
