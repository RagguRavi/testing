package designPattern.creationaldesignPattern.AbstractFactory;

public class AbstractFactoryMain {
public static void main(String[] args) {
	AbstractFactory abstractFactory=FactoryProducer.getFactory("color");
	System.out.println(abstractFactory.getColorFactory("red"));
}
}
