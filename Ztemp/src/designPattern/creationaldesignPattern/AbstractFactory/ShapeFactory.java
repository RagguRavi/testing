package designPattern.creationaldesignPattern.AbstractFactory;

public class ShapeFactory extends AbstractFactory{
 
	@Override
	public Shape getShapeFactory(String shapeType) {
		if(shapeType.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		else if(shapeType.equalsIgnoreCase("SQUARE"))
			return new Square();
		
		return null;
	}


	@Override
	Color getColorFactory(String colorName) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
