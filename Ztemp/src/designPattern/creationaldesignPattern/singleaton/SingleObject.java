package designPattern.creationaldesignPattern.singleaton;

public class SingleObject {
static private SingleObject singleObject=new SingleObject();

private SingleObject() {}

public static SingleObject getSingleObject() {
	return singleObject;
}
}
