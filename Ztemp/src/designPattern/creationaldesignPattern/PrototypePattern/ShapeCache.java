package designPattern.creationaldesignPattern.PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
static Map<String,Shape> shapeMap=new HashMap<>();

public static Shape getShape(String shapeId) throws CloneNotSupportedException
{
	Shape shape=shapeMap.get(shapeId);
	return (Shape)shape.clone();
}

public static void load() {
	
	Circle circle=new Circle();
	circle.setId("1");
	shapeMap.put(circle.getId(), circle);
	
	Rectangle rectangle=new Rectangle();
	rectangle.setId("2");
	shapeMap.put(rectangle.getId(), rectangle);
	
	Square square=new Square();
	square.setId("3");
	shapeMap.put(square.getId(), square);
	
	
}
}
