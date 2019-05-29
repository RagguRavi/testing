package designPattern.behavioralDesignPattern.Strategy;

public class RubberDuck extends Duck{
	@Override
	public void quack() {
		System.out.println("Rubber duck quack sound");
	} 
	
	@Override
	public void display() {
		System.out.println("Rubber duck diplay");
	}
}
