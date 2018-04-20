package designPattern.creationaldesignPattern.AbstractFactory;

public class FactoryProducer {

	static AbstractFactory getFactory(String factoryName)
	{
		if(factoryName.equalsIgnoreCase("Shape"))
			return new ShapeFactory();
		else if(factoryName.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
