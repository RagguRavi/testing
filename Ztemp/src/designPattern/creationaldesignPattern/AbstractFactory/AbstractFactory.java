package designPattern.creationaldesignPattern.AbstractFactory;

public abstract class AbstractFactory {
abstract Shape getShapeFactory(String shapeType);
abstract Color getColorFactory(String colorName);
}
