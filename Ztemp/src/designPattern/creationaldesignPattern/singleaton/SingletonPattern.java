package designPattern.creationaldesignPattern.singleaton;

public class SingletonPattern {
public static void main(String[] args) {
	SingleObject singleObject=SingleObject.getSingleObject();
	System.out.println(singleObject);
}
}
