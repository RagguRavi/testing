package designPattern.creationaldesignPattern.factory;

public class FactoryDemo {
public static void main(String[] args) {
	ShapeFactory shapeFactory=new ShapeFactory();
	System.out.println("------------Main Started-----------");
	System.out.println(shapeFactory.getShape("circle"));
	System.out.println(shapeFactory.getShape("square"));
	System.out.println(shapeFactory.getShape("rectangle"));
}
}
