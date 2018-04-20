package designPattern.creationaldesignPattern.BuilderPattern;

public abstract class ColdDrink implements Item{
@Override
public Packing packing() {
	// TODO Auto-generated method stub
	return new Bottle();
}
}
