package designPattern.creationaldesignPattern.AbstractFactory;

public class ColorFactory extends AbstractFactory{

	@Override
	Shape getShapeFactory(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color getColorFactory(String colorName) {
		if(colorName.equalsIgnoreCase("RED"))
			return new Red();
		else if(colorName.equalsIgnoreCase("GREEN"))
			return new Green();
		else if(colorName.equalsIgnoreCase("BLUE"))
			return new Blue();
		return null;
	}

}
