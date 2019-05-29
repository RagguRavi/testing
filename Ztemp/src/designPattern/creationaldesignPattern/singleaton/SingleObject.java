package designPattern.creationaldesignPattern.singleaton;

public class SingleObject {
static final private SingleObject singleObject=new SingleObject();

private SingleObject() {}

public static SingleObject getSingleObject() {
	return singleObject;
}
}
